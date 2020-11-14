package com.lele.control;

import com.lele.data.Data;
import com.lele.model.EnBullet;
import com.lele.model.Enemy;
import com.lele.view.GameFrame;

public class EnemyBullet extends Thread {
    private GameFrame f;

    public EnemyBullet(GameFrame f) {
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < Data.enemyList.size(); i++) {
                Enemy enemy = Data.enemyList.get(i);
                int x = enemy.getX();
                int y = enemy.getY();
                EnBullet bullet = new EnBullet(x, y, enemy.getDiretion());
                Data.enzdList.add(bullet);
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
		
