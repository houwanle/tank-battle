package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Bomb;
import com.lele.model.Boold;
import com.lele.model.Speed;
import com.lele.model.stage;
import com.lele.view.GameFrame;

import java.util.Random;

public class StageThread extends Thread {
    private GameFrame f;

    public StageThread(GameFrame f) {
        super();
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            if (Data.pouse == 0) {
                Random ra = new Random();
                int key = ra.nextInt(3);
                int x = ra.nextInt(560);
                int y = ra.nextInt(560);
                stage stage = null;
                if (key == 0) {
                    stage = new Speed(x, y);
                } else if (key == 1) {
                    stage = new Bomb(x, y);
                } else if (key == 2) {
                    stage = new Boold(x, y);
                }
                Data.stagelList.add(stage);
                System.out.println(Data.stagelList.size());
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}






