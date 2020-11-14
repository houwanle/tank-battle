package com.lele.control;

import com.lele.data.Data;
import com.lele.model.EnBullet;
import com.lele.view.GameFrame;

public class EnemyBulletMoveThread extends Thread {
    private GameFrame f;

    public EnemyBulletMoveThread(GameFrame f) {
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            if (Data.pouse == 0) {
                for (int i = 0; i < Data.enzdList.size(); i++) {
                    EnBullet enbullet = Data.enzdList.get(i);
                    if (enbullet.getY() > 0 && enbullet.getDiretion() == 0) {
                        enbullet.up();
                    } else if (enbullet.getY() < 560 && enbullet.getDiretion() == 1) {
                        enbullet.down();
                    } else if (enbullet.getX() > 0 && enbullet.getDiretion() == 2) {
                        enbullet.left();
                    } else if (enbullet.getX() < 560 && enbullet.getDiretion() == 3) {
                        enbullet.right();
                    } else {
                        Data.enzdList.remove(enbullet);
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
