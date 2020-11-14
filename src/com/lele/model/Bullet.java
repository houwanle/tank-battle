package com.lele.model;

import com.lele.data.Data;

import java.awt.*;
import java.util.ArrayList;

public class Bullet {
    private int x;
    private int[][] map;
    private Map map1;
    private int y;
    private int Diretion;

    public Bullet(int x, int y, int Diretion) {
        super();
        this.x = x;
        this.y = y;
        this.Diretion = Diretion;
    }

    public Bullet() {
        map = Map.map1;
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

    public Map getMap1() {
        return map1;
    }

    public void setMap1(Map map1) {
        this.map1 = map1;
    }

    public void left() {
        x -= 20;

    }

    public void right() {
        x += 20;

    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public boolean BulletToMap(java.util.List<Bullet> bullets, int[][] map1) {
        boolean is = false;
        this.map = map1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                for (int k = 0; k < Data.zdList.size(); k++) {
                    Bullet bullet = Data.zdList.get(k);
                    Rectangle rebuttet = new Rectangle(bullet.getX(), bullet.getY(), 15, 15);
                    Rectangle mapRectangle = new Rectangle(i * 40, j * 40, 40, 40);
                    if (mapRectangle.intersects(rebuttet)) {
                        if (map[j][i] == 1) {
                            map[j][i] = 0;
                            Data.zdList.remove(bullet);
                            is = true;
                        }
                        if (map[j][i] == 3) {
                            Data.zdList.remove(bullet);
                            is = true;
                        }
                    }
                }
            }
        }
        return is;

    }

    public boolean Bullettohome(ArrayList<Bullet> zdList) {
        boolean is = false;
        for (int i = 0; i < Data.zdList.size(); i++) {
            Bullet bullet = Data.zdList.get(i);
            Rectangle rebuttet = new Rectangle(bullet.getX(), bullet.getY(), 40, 40);
            Rectangle mapRectangle = new Rectangle(280, 560, 40, 40);
            if (mapRectangle.intersects(rebuttet)) {
                Data.zdList.remove(rebuttet);
                Data.b = 1;
                is = true;
            }
        }
        return is;

    }
}
