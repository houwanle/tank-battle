package com.lele.view;

import com.lele.data.Data;
import com.lele.model.Player;

import javax.swing.*;
import java.awt.*;


public class GameInfoArea extends JPanel {
    BorderLayout layout = new BorderLayout();

    public GameInfoArea() {
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(200, 600));
        up up = new up();
        down down = new down();
        center center = new center();
        this.add(up, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(down, BorderLayout.SOUTH);
    }
}

class up extends JPanel {
    public up() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(200, 200));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Data.IMG_gia1, 0, 0, 200, 200, this);
        g.setFont(new Font(null, Font.PLAIN, 14));
        g.setColor(Color.yellow);
        g.drawString("剩余敌方坦克还有：" + Data.backlist.size(), 20, 40);
        g.drawImage(Data.IMG_buledown, 20, 50, 40, 40, this);
        g.drawString("X     " + Data.bulecount.size(), 70, 70);
        g.drawImage(Data.IMG_pinkDown, 20, 100, 40, 40, this);
        g.drawString("X     " + Data.pinkcount.size(), 70, 120);
        g.drawImage(Data.IMG_yellowDown, 20, 150, 40, 40, this);
        g.drawString("X     " + Data.yellowcount.size(), 70, 170);
        this.repaint();
    }
}

class center extends JPanel {
    public center() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(200, 200));
        this.setBackground(Color.gray);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Data.IMG_gia2, 0, 0, 200, 200, this);
        g.setColor(Color.yellow);
        g.setFont(new Font(null, Font.PLAIN, 14));
        g.drawString("游戏玩法：", 30, 20);
        g.drawString("向上：       W", 30, 50);
        g.drawString("向下：       S", 30, 70);
        g.drawString("向左：       A", 30, 90);
        g.drawString("向右：       D", 30, 110);
        g.drawString("发射：       J", 30, 130);
        g.drawString("暂停：       P", 30, 150);
        g.drawString("继续：       O", 30, 170);
        this.repaint();
    }
}

class down extends JPanel {
    public down() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(100, 200));
        this.setBackground(Color.gray);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Data.IMG_gia3, 0, 0, 200, 200, this);
        g.setColor(Color.yellow);
        g.setFont(new Font(null, Font.PLAIN, 14));
        g.drawString("玩家" + Data.name + "：", 30, 15);
        g.drawString("当前的关卡为：" + "第" + Data.levle + "关", 30, 50);
        g.drawString("总共击毁坦克：" + Data.hit, 30, 80);
        g.drawString("总共得分：" + Data.count, 30, 110);
        g.drawString("当前生命值：" + Player.getHP(), 30, 140);
        this.repaint();
    }
}