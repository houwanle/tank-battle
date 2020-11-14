package com.lele.model;

import com.lele.data.Data;

import java.awt.*;
import java.util.List;

public abstract class stage {
    private int x;
    private int y;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public stage() {
        super();
    }

    public stage(int x, int y) {
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

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw(Graphics g);

    public boolean stagetoplay(Player player, List<stage> stages) {
        boolean is = false;
        for (int i = 0; i < Data.stagelList.size(); i++) {
            stage st = Data.stagelList.get(i);
            Rectangle stageRectangle = new Rectangle(st.getX(), st.getY(), 40, 40);
            if (stageRectangle.intersects(new Rectangle(Data.player.getX(), Data.player.getY(), 40, 40))) {
                Data.stagelList.remove(st);
                if (st.getType() == new Bomb().getType()) {
                    for (int k = 0; k < Data.enemyList.size(); k++) {
                        Enemy en = Data.enemyList.get(i);
                        Data.enemyList.remove(en);
                        Data.hit++;
                        if (en.getType() == new YellowEnemy().getType()) {
                            Data.count += YellowEnemy.getCount();
                        }
                        if (en.getType() == new BuleEnemy().getType()) {
                            Data.count += BuleEnemy.getCount();
                        }
                        if (en.getType() == new PinkEnemy().getType()) {
                            Data.count += PinkEnemy.getCount();
                        }
                    }
                }
                if (st.getType() == new Boold().getType()) {
                    int hp = Player.getHP() + 1;
                    Player.setHP(hp);
                    System.out.println(Player.getHP());
                }
                if (st.getType() == new Speed().getType()) {
                    int speed = Player.getSpeed() + 10;
                    Player.setSpeed(speed);
                }
                is = true;
                break;
            }
        }
        return is;

    }

}
