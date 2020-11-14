package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Bullet;
import com.lele.view.GameFrame;

public class BulletMoveThread extends Thread {

    private GameFrame f;

    public BulletMoveThread(GameFrame f) {
        super();
        this.f = f;
    }

    public void run() {
        while (true) {
            if (Data.pouse == 0) {
                for (int i = 0; i < Data.zdList.size(); i++) {
                    try {
                        Bullet zd = Data.zdList.get(i);
                        if (zd.getY() > 0 && zd.getDiretion() == 1) {
                            zd.up();
                        } else if (zd.getY() < 560 && zd.getDiretion() == 2) {
                            zd.down();
                        } else if (zd.getX() > 0 && zd.getDiretion() == 3) {
                            zd.left();
                        } else if (zd.getX() < 560 && zd.getDiretion() == 4) {
                            zd.right();
                        } else {
                            Data.zdList.remove(zd);
                        }
                    } catch (Exception e) {
                    }

                }
            }
            // 子弹移动的速率
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
