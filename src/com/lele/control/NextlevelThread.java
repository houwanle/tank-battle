package com.lele.control;

import com.lele.data.Data;
import com.lele.view.GameFrame;

import javax.swing.*;

public class NextlevelThread extends Thread {
    GameFrame f;

    public NextlevelThread(GameFrame f) {
        super();
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            JLabel lbLabel = new JLabel(new ImageIcon("image/1.gif"));
            JLabel lbLabel2 = new JLabel(new ImageIcon("image/gameOver.gif"));
            if (Data.pouse == 0) {
                int count = Data.enemyList.size() + Data.backlist.size();
                if (count == 0 && Data.start == 1) {
                    lbLabel.setBounds(150, 150, 300, 300);
                    f.getGa().add(lbLabel);
                    Data.initenemy(20);
                    Data.player.setX(200);
                    Data.player.setY(560);
                    Data.levle++;
                }
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            f.getGa().remove(lbLabel);
        }

    }


}
