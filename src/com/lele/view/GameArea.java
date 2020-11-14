package com.lele.view;


import com.lele.data.Data;
import com.lele.model.*;

import javax.swing.*;
import java.awt.*;

public class GameArea extends JPanel {
    private int[][] map;
    private Map map1;

    public Map getMap1() {
        return map1;
    }

    public void setMap1(Map map1) {
        this.map1 = map1;
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }


    public GameArea() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.black);
        if (!Data.isRestart) {
            map = Map.map1;

        }else {

        }


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (Data.start == 0) {
            g.drawImage(Data.IMG_ST, 0, 0, 600, 600, this);
            this.repaint();
        }
        if (Data.start == 1 && Data.a == 1) {
            Data.player.playertoenemy(Data.enemyList);
            Data.player.palytomap(map, Data.player);
            Data.player.drawup(g);
            Data.home.draw(g);
            drawstage(g);
            drawbullet(g);
            drawEnbullet(g);
            drawEnemy(g);
            drawmap(g);
            this.repaint();

        }
        if (Data.start == 1 && Data.a == 2) {
            Data.player.playertoenemy(Data.enemyList);
            Data.player.palytomap(map, Data.player);
            Data.player.drawdown(g);
            Data.home.draw(g);
            drawstage(g);
            drawbullet(g);
            drawEnbullet(g);
            drawmap(g);
            drawEnemy(g);
            this.repaint();
        }
        if (Data.start == 1 && Data.a == 3) {
            Data.player.playertoenemy(Data.enemyList);
            Data.player.palytomap(map, Data.player);
            Data.player.drawleft(g);
            Data.home.draw(g);
            drawstage(g);
            drawbullet(g);
            drawEnbullet(g);
            drawEnemy(g);
            drawmap(g);
            this.repaint();

        }
        if (Data.start == 1 && Data.a == 4) {
            Data.player.playertoenemy(Data.enemyList);
            Data.player.palytomap(map, Data.player);
            Data.player.drawright(g);
            Data.home.draw(g);
            drawstage(g);
            drawEnemy(g);
            drawEnbullet(g);
            drawbullet(g);
            drawmap(g);
            this.repaint();

        }

        if (Data.levle == 1) {
            if (Data.isRestart || Data.isGameOver ) {
                Data.isRestart=false;
                Data.player.setX(200);
                Data.player.setY(560);
                Map.map1 = new int[][]{
                  {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 ,0},
          		  {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
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
                map = Map.map1;
            }else {
                map = Map.map1;

            }

            this.repaint();
        }
        if (Data.levle == 2) {
            if (Data.isRestart || Data.isGameOver ) {
                Data.isRestart=false;
                Data.player.setX(200);
                Data.player.setY(560);
                Map.map2 = new int[][]{
                    {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                    {0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 0, 0},
                    {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 1, 0},
                    {2, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 2, 2, 2, 4},
                    {2, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 2, 2, 2, 0},
                    {2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 2, 1, 1, 1},
                    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1},
                    {1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 0},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 3},
                    {3, 0, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 3},
                    {0, 3, 1, 0, 3, 0, 1, 1, 1, 0, 1, 1, 3, 3, 3},
                    {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},

                };
                map = Map.map2;
            }else {
            map = Map.map2;
            }
            this.repaint();
        }
        if (Data.levle == 3) {
            if (Data.isRestart || Data.isGameOver ) {
                Data.isRestart=false;
                Data.player.setX(200);
                Data.player.setY(560);
                Map.map3 = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 3, 3, 2, 2, 1, 1, 3, 1, 1, 2, 2, 3, 3, 0},
                        {0, 0, 3, 3, 2, 2, 1, 3, 1, 2, 2, 3, 3, 0, 0},
                        {0, 0, 0, 3, 2, 2, 2, 3, 2, 2, 3, 0, 0, 0, 0},
                        {2, 0, 0, 0, 0, 3, 2, 2, 2, 3, 0, 0, 0, 0, 2},
                        {3, 2, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 2, 3},
                        {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                        {0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 3, 0, 3, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 3, 0, 0, 0, 1, 0, 1, 0, 0, 0, 3, 0, 0},

                };
                map = Map.map3;
            }else {
            map = Map.map3;
            }
            this.repaint();
        }
    }

    private void drawmap(Graphics g) {
        if (Data.start == 1) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    int key = map[j][i];
                    switch (key) {
                        case 1: {
                            g.drawImage(Data.IMG_wall, i * 40, j * 40, 40, 40, this);
                            break;
                        }
                        case 2: {
                            g.drawImage(Data.IMG_grass, i * 40, j * 40, 40, 40, this);
                            break;
                        }
                        case 3: {
                            g.drawImage(Data.IMG_tie, i * 40, j * 40, 40, 40, this);
                            break;
                        }
                        case 4: {
                            g.drawImage(Data.IMG_warter, i * 40, j * 40, 40, 40, this);
                            break;
                        }

                    }
                }
            }
        }
    }

    private void drawbullet(Graphics g) {
        for (int i = 0; i < Data.zdList.size(); i++) {
            Bullet zd = Data.zdList.get(i);
            zd.BulletToMap(Data.zdList, map);
            zd.Bullettohome(Data.zdList);
            zd.draw(g);

        }
    }

    private void drawEnemy(Graphics g) {
        for (int i = 0; i < Data.enemyList.size(); i++) {
            Enemy en = Data.enemyList.get(i);
            Life life =new Life(en.getX(),en.getY(),en.getHp());
            life.draw(g);
            Enemy.playertoenemy(Data.enemyList);
            en.palytomap(map, Data.enemyList);
            en.draw(g);
        }
    }

    private void drawEnbullet(Graphics g) {
        for (int i = 0; i < Data.enzdList.size(); i++) {
            EnBullet en = Data.enzdList.get(i);
            en.BulletToMap(Data.enzdList, map);
            en.EnBullettohome(Data.enzdList);
            en.draw(g);
        }
    }

    private void drawstage(Graphics g) {
        for (int i = 0; i < Data.stagelList.size(); i++) {
            stage st = Data.stagelList.get(i);
            st.stagetoplay(Data.player, Data.stagelList);
            st.draw(g);
        }
    }
}