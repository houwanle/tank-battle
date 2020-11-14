package com.lele.data;

import com.lele.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Data {

    public static boolean isRestart=false;
    public static boolean isGameOver=false;
    public static int start = 0;// 1为开始  0为还未开始
    public static int levle = 1;//关卡
    public static int pouse = 0;//0表示继续 1表示暂停
    public static String name = "";
    public static int time = 0;
    public static int b = 0;
    public static int a = 1;//玩家的方向 1为上 2为下 3为左 4为右
    public static int count; // 计算积分数
    public static int hit = 0;  // 计算击毁坦克的数量
    public static Player player = new Player(200, 560, 3, 1);// 创建 玩家
    public static home home = new home(280, 560, 1);// 创建碉堡
    // 加载图片 相对路径 jpg png gif
    public static final Image IMG_ST = new ImageIcon("image/timg (2).jpg").getImage();
    public static final Image IMG_buleUp = new ImageIcon("image/buleUp.gif").getImage();
    public static final Image IMG_buledown = new ImageIcon("image/buledown.gif").getImage();
    public static final Image IMG_buleLeft = new ImageIcon("image/buleLeft.gif").getImage();
    public static final Image IMG_buleRight = new ImageIcon("image/buleRight.gif").getImage();
    public static final Image IMG_pinkDown = new ImageIcon("image/pinkDown.gif").getImage();
    public static final Image IMG_pinkLeft = new ImageIcon("image/pinkLeft.gif").getImage();
    public static final Image IMG_pinkRight = new ImageIcon("image/pinkRight.gif").getImage();
    public static final Image IMG_pinkUp = new ImageIcon("image/pinkUp.gif").getImage();
    public static final Image IMG_yellowDown = new ImageIcon("image/yellowDown.gif").getImage();
    public static final Image IMG_yellowLeft = new ImageIcon("image/yellowLeft.gif").getImage();
    public static final Image IMG_yellowRight = new ImageIcon("image/yellowRight.gif").getImage();
    public static final Image IMG_yellowUp = new ImageIcon("image/yellowUp.gif").getImage();
    public static final Image IMG_tie = new ImageIcon("image/tie4.gif").getImage();
    public static final Image IMG_warter = new ImageIcon("image/water.gif").getImage();
    public static final Image IMG_grass = new ImageIcon("image/grass.gif").getImage();
    public static final Image IMG_wall = new ImageIcon("image/walls.gif").getImage();
    public static final Image IMG_smallwall = new ImageIcon("image/smallwalls.gif").getImage();
    public static final Image IMG_PLAYER1 = new ImageIcon("image/player1.gif").getImage();
    public static final Image IMG_PLAYER2 = new ImageIcon("image/player2.gif").getImage();
    public static final Image IMG_PLAYER3 = new ImageIcon("image/player3.gif").getImage();
    public static final Image IMG_PLAYER4 = new ImageIcon("image/player4.gif").getImage();
    public static final Image IMG_home = new ImageIcon("image/symbol.gif").getImage();
    public static final Image IMG_bullet = new ImageIcon("image/bullet.gif").getImage();
    public static final Image IMG_over = new ImageIcon("image/gameOver.gif").getImage();
    public static final Image IMG_win = new ImageIcon("image/gameWin.jpeg").getImage();
    public static final Image IMG_hp = new ImageIcon("image/hp.png").getImage();
    public static final Image IMG_speed = new ImageIcon("image/124.png").getImage();
    public static final Image IMG_bomb = new ImageIcon("image/128.png").getImage();
    public static final Image IMG_gia1 = new ImageIcon("image/i1.jpg").getImage();
    public static final Image IMG_gia2 = new ImageIcon("image/i2.jpg").getImage();
    public static final Image IMG_gia3 = new ImageIcon("image/i3.jpg").getImage();
    //  子弹的集合
    public static ArrayList<Bullet> zdList = new ArrayList<Bullet>();
    public static ArrayList<EnBullet> enzdList = new ArrayList<EnBullet>();
    // 界面敌人的集合
    public static ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
    //后台敌人的集合
    public static ArrayList<Enemy> backlist = new ArrayList<Enemy>();
    // 计算各个敌人的数量集合
    public static ArrayList<Enemy> yellowcount = new ArrayList<Enemy>();
    public static ArrayList<Enemy> bulecount = new ArrayList<Enemy>();
    public static ArrayList<Enemy> pinkcount = new ArrayList<Enemy>();
    //道具的集合
    public static ArrayList<stage> stagelList = new ArrayList<stage>();

    public static void initenemy(int num) {
        Random ran = new Random();
        for (int i = 0; i < num; i++) {
            int key = ran.nextInt(3);
            Enemy en = null;
            if (key == 0) {
                en = new YellowEnemy(0, 0, 1, 0, 0,100);
                yellowcount.add(en);
            } else if (key == 1) {
                en = new BuleEnemy(560, 0, 1, 0, 0,100);
                bulecount.add(en);
            } else {
                en = new PinkEnemy(250, 0, 1, 0, 0,100);
                pinkcount.add(en);
            }
            backlist.add(en);
        }
    }

}




