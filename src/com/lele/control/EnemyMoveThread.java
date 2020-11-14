package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Enemy;
import com.lele.view.GameFrame;

public class EnemyMoveThread extends Thread {
    private GameFrame f;

    public EnemyMoveThread(GameFrame f) {
        super();
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            if (Data.pouse == 0) {
                for (int i = 0; i < Data.enemyList.size(); i++) {
                    Enemy enemy = Data.enemyList.get(i);
                    if (enemy.getY() < 560) {
                        enemy.movedown();
                    }
                    if (enemy.getY() > 0) {
                        enemy.moveup();
                    }
                    if (enemy.getX() < 560) {
                        enemy.moveright();
                    }
                    if (enemy.getX() > 0) {
                        enemy.moveleft();
                    }
                }
            }
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
