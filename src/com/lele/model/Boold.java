package com.lele.model;

import com.lele.data.Data;

import java.awt.*;

public class Boold extends stage {
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

    public Boold(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    private int x;
    protected int type = 1;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int y;

    public Boold() {
        super();
    }

    public void draw(Graphics g) {
        g.drawImage(Data.IMG_hp, x, y, x + 60, y + 60, 0, 0, 60, 60, null);
    }

}

