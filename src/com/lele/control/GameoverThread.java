package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Map;
import com.lele.model.Player;
import com.lele.model.home;
import com.lele.view.GameArea;
import com.lele.view.GameFrame;

import javax.swing.*;

public class GameoverThread extends Thread {
    public static boolean isAdd = true;
    GameFrame f;

    public GameoverThread(GameFrame f) {
        super();
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            JLabel lbLabel = new JLabel(new ImageIcon("image/gameOver.gif"));
            if (Data.isGameOver) {
//Data.isGameOver
                Data.isGameOver=false;
                Map.map1 = new int[][]{
                        {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
                        {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
                        {0, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {4, 4, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 4, 4},
                        {3, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 3},
                        {2, 2, 0, 3, 0, 3, 0, 0, 0, 3, 0, 3, 0, 2, 2},
                        {2, 2, 2, 2, 2, 1, 0, 0, 0, 1, 2, 2, 2, 2, 2},
                        {0, 3, 3, 0, 1, 1, 1, 0, 1, 1, 1, 0, 3, 3, 0},
                        {2, 2, 2, 2, 0, 0, 0, 2, 0, 0, 0, 2, 2, 2, 2},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 0, 1, 0, 1, 2, 2, 2, 2, 2, 1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
                };
                new GameArea();
                Data.b =0;
                Player.setHP(3) ;
                Data.pouse = 0;
                Data.home = new home(280, 560, 1);

//                f.getGa().repaint();
                f.getGa().removeAll();

                Data.player.setX(200);
                Data.player.setY(560);

            }
//            System.out.println(Data.b);
//            System.out.println( Player.getHP());
            if (Data.b == 1 || Player.getHP() == 0) {

                    lbLabel.setBounds(150, 150, 300, 300);
                    f.getGa().add(lbLabel);
                    Data.pouse = 1;

                Data.b = 0;
//                Player.setHP(3);
//                Data.isGameOver = true;
            }
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

