package com.lele.model;

import com.lele.data.Data;

import java.awt.*;
import java.util.ArrayList;

public class EnBullet {
    private int x;
    private int y;
    private int Diretion;
    private int[][] map;

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public Map getMap1() {
        return map1;
    }

    public void setMap1(Map map1) {
        this.map1 = map1;
    }

    private Map map1;

    public EnBullet(int x, int y, int Diretion) {
        super();
        this.x = x;
        this.y = y;
        this.Diretion = Diretion;
    }

    public int getDiretion() {
        return Diretion;
    }

    public void setDiretion(int diretion) {
        Diretion = diretion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics g) {
        g.drawImage(Data.IMG_bullet, x, y, x + 10, y + 10, 0, 0, 15, 15, null);
    }

    public void up() {
        y -= 20;

    }

    public void down() {
        y += 20;

    }

    public void left() {
        x -= 20;

    }

    public void right() {
        x += 20;
    }

    public boolean BulletToMap(ArrayList<EnBullet> enzdList, int[][] map1) {
        boolean is = false;
        this.map = map1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                for (int k = 0; k < Data.enzdList.size(); k++) {
                    EnBullet bullet = Data.enzdList.get(k);
                    Rectangle rebuttet = new Rectangle(bullet.getX(), bullet.getY(), 40, 40);
                    Rectangle mapRectangle = new Rectangle(i * 40, j * 40, 40, 40);
                    if (mapRectangle.intersects(rebuttet)) {
                        if (map[j][i] == 1) {
                            map[j][i] = 0;
                            Data.enzdList.remove(bullet);
                            is = true;
                        }
                        if (map[j][i] == 3) {
                            Data.enzdList.remove(bullet);
                            is = true;
                        }
                    }
                }
            }
        }
        return is;

    }

    public EnBullet() {
        super();
    }

    public boolean EnBullettohome(ArrayList<EnBullet> enzdList) {
        boolean is = false;
        for (int i = 0; i < Data.enzdList.size(); i++) {
            EnBullet bullet = Data.enzdList.get(i);
            Rectangle rebuttet = new Rectangle(bullet.getX(), bullet.getY(), 15, 15);
            Rectangle mapRectangle = new Rectangle(280, 560, 40, 40);
            if (mapRectangle.intersects(rebuttet)) {
                Data.enzdList.remove(rebuttet);
                is = true;
            }
        }
        return is;

    }
}
