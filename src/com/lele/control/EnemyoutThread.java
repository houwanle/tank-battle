package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Enemy;
import com.lele.view.GameFrame;

public class EnemyoutThread extends Thread {
    private GameFrame f;

    public EnemyoutThread(GameFrame f) {
        super();
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            if (Data.pouse == 0) {
                for (int i = 0; i < Data.backlist.size(); i++) {
                    Enemy en = Data.backlist.get(i);
                    if (Data.enemyList.size() < 3) {
                        Data.enemyList.add(en);
                        Data.backlist.remove(en);
                        Data.yellowcount.remove(en);
                        Data.bulecount.remove(en);
                        Data.pinkcount.remove(en);
                    }
                }
            }
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
