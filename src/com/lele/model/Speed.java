package com.lele.model;

import com.lele.data.Data;

import java.awt.*;

public class Speed extends stage {
    private int x;
    private int y;
    protected int type = 2;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Speed(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Speed() {
        super();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics g) {
        g.drawImage(Data.IMG_speed, x, y, x + 60, y + 60, 0, 0, 60, 60, null);
    }
}
