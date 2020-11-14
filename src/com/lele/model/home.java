package com.lele.model;

import com.lele.data.Data;

import java.awt.*;

public class home {
    private int x;
    private int y;
    private int Hp;

    public home(int x, int y, int hp) {
        super();
        this.x = x;
        this.y = y;
        Hp = hp;
    }

    public int getX() {
        return x;
    }

    public home() {
        super();
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

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public void draw(Graphics g) {
        g.drawImage(Data.IMG_home, x, y, x + 40, y + 40, 0, 0, 60, 60, null);
    }
}
