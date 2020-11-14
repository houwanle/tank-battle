package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Bullet;
import com.lele.model.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlayerKeyListener extends KeyAdapter {
    private Player player;

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W) {
            if (Data.pouse == 0 && Data.player.getY() > 0) {
                Data.player.up();
                Data.a = 1;
            }
        }
        if (key == KeyEvent.VK_S) {
            if (Data.pouse == 0 && Data.player.getY() < 560) {
                Data.player.down();
                Data.a = 2;
            }
        }
        if (key == KeyEvent.VK_A) {
            if (Data.pouse == 0 && Data.player.getX() > 0) {
                Data.player.left();
                Data.a = 3;
            }
        }
        if (key == KeyEvent.VK_D) {
            if (Data.pouse == 0 && Data.player.getX() < 560) {
                Data.player.right();
                Data.a = 4;
            }
        }
        if (key == KeyEvent.VK_P) {
            Data.pouse = 1;
        }
        if (key == KeyEvent.VK_O) {
            Data.pouse = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_J) {
            if (Data.pouse == 0 && Data.a == 1) {
                int x = Data.player.getX() + 16;
                int y = Data.player.getY() - 5;
                Bullet bullet = new Bullet(x, y, Data.a);
                Data.zdList.add(bullet);
                return;
            }
            if (Data.pouse == 0 && Data.a == 2) {
                int x = Data.player.getX() + 16;
                int y = Data.player.getY() + 32;
                Bullet bullet = new Bullet(x, y, Data.a);
                Data.zdList.add(bullet);
                return;
            }
            if (Data.pouse == 0 && Data.a == 3) {
                int x = Data.player.getX() - 10;
                int y = Data.player.getY() + 15;
                Bullet bullet = new Bullet(x, y, Data.a);
                Data.zdList.add(bullet);
                return;
            }
            if (Data.pouse == 0 && Data.a == 4) {
                int x = Data.player.getX() + 38;
                int y = Data.player.getY() + 15;
                Bullet bullet = new Bullet(x, y, Data.a);
                Data.zdList.add(bullet);
                return;
            }
        }
    }
}
