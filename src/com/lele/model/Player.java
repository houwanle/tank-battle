package com.lele.model;

import com.lele.data.Data;

import java.awt.*;
import java.util.List;


public class Player {
    private int x;
    private int y;
    private static int HP = 3;
    protected int oldX;
    protected int oldY;
    private static int Speed = 9000;
    private int[][] map;
    private Map map1;

    public Player() {
        map = Map.map1;
    }

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

    public Player(int x, int y, int hP, int speed) {
        super();
        this.x = x;
        this.y = y;
        this.oldX = x;
        this.oldY = y;
        HP = hP;
        Speed = speed;
    }

    public static int getHP() {
        return HP;
    }

    public static void setHP(int hP) {
        HP = hP;
    }

    public static int getSpeed() {
        return Speed;
    }

    public static void setSpeed(int speed) {
        Speed = speed;
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

    public void up() {
        this.oldX = x;
        this.oldY = y;
        y -= Speed + 5;

    }

    public void down() {
        this.oldX = x;
        this.oldY = y;
        y += Speed + 5;
    }

    public void left() {
        this.oldX = x;
        this.oldY = y;
        x -= Speed + 5;
    }

    public void right() {
        this.oldX = x;
        this.oldY = y;
        x += Speed + 5;
    }

    public int getOldX() {
        return oldX;
    }

    public void setOldX(int oldX) {
        this.oldX = oldX;
    }

    public int getOldY() {
        return oldY;
    }

    public void setOldY(int oldY) {
        this.oldY = oldY;
    }

    private void changToOldDir() {
        x = oldX;
        y = oldY;
    }

    public boolean palytomap(int[][] map1, Player player) {
        boolean is = false;
        this.map = map1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int key = map[j][i];
                Rectangle replay = new Rectangle(Data.player.getX(), Data.player.getY(), 40, 40);
                Rectangle mapRectangle = new Rectangle(i * 40, j * 40, 30, 30);
                if (mapRectangle.intersects(replay)) {
                    if (map[j][i] == 1) {
                        this.changToOldDir();
                        is = true;
                    }
                    if (map[j][i] == 3) {
                        this.changToOldDir();
                        is = true;
                    }
                    if (map[j][i] == 4) {
                        this.changToOldDir();
                        is = true;
                    }
                }
            }
        }
        return false;
    }

    public boolean playertoenemy(List<Enemy> enemies) {
        boolean is = false;
        for (int i = 0; i < Data.enemyList.size(); i++) {
            Enemy enemy = Data.enemyList.get(i);
            Rectangle enemyRectangle = new Rectangle(enemy.getX(), enemy.getY(), 35, 35);
            if (enemyRectangle.intersects(new Rectangle(Data.player.getX(), Data.player.getY(), 40, 40))) {
                this.changToOldDir();
                is = true;
                break;
            }
        }
        return is;

    }

    public void drawup(Graphics g) {
        g.drawImage(Data.IMG_PLAYER1, x, y, x + 40, y + 40, 0, 0, 60, 60, null);
    }

    public void drawdown(Graphics g) {
        g.drawImage(Data.IMG_PLAYER2, x, y, x + 40, y + 40, 0, 0, 60, 60, null);

    }

    public void drawleft(Graphics g) {
        g.drawImage(Data.IMG_PLAYER3, x, y, x + 40, y + 40, 0, 0, 60, 60, null);

    }

    public void drawright(Graphics g) {
        g.drawImage(Data.IMG_PLAYER4, x, y, x + 40, y + 40, 0, 0, 60, 60, null);

    }
}
