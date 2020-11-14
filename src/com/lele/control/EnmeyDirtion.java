package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Enemy;
import com.lele.view.GameFrame;

import java.util.Random;

public class EnmeyDirtion extends Thread {
    private GameFrame f;

    public EnmeyDirtion(GameFrame f) {
        super();
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            if (Data.pouse == 0) {
                for (int i = 0; i < Data.enemyList.size(); i++) {
                    Enemy enemy = Data.enemyList.get(i);
                    Random in = new Random();
                    enemy.setDiretion(in.nextInt(4));
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
