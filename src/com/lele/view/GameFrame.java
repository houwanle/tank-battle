package com.lele.view;

import com.lele.control.*;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private GameMeun gm; // 游戏菜单栏
    private GameInfoArea gi = new GameInfoArea();//游戏信息区
    private GameArea ga = new GameArea(); // 游戏区
    private StartAction sa = new StartAction(this);//开始的动作监听
    private PlayerKeyListener pkl = new PlayerKeyListener();//键盘监听
    private BulletMoveThread bmt = new BulletMoveThread(this);//子弹移动的线程
    private EnemyMoveThread emt = new EnemyMoveThread(this);//敌人移动的线程
    private EnmeyDirtion edDirtion = new EnmeyDirtion(this);//敌人调转方向的线程
    private EnemyBullet eb = new EnemyBullet(this);//敌方子弹生成的线程
    private EnemyBulletMoveThread ebmt = new EnemyBulletMoveThread(this);//敌人子弹移动的线程
    private BoomThread bThread = new BoomThread(this);
    private EnemyoutThread eot = new EnemyoutThread(this);
    private NextlevelThread nlt = new NextlevelThread(this);
    private StageThread st = new StageThread(this);
    private GameoverThread got = new GameoverThread(this);
    BorderLayout layout = new BorderLayout();

    public GameFrame() {
        gm = new GameMeun(this);
        eb.start();
        bmt.start();
        emt.start();
        ebmt.start();
        edDirtion.start();
        bThread.start();
        eot.start();
        nlt.start();
        st.start();
        got.start();

        this.addKeyListener(pkl);
        this.setJMenuBar(gm);
        this.setTitle("坦克大战");
        this.setLayout(layout);
        this.add(gi, BorderLayout.EAST);
        this.setVisible(true);
        this.add(ga, BorderLayout.WEST);

        initBar();
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void initBar() {
        gm.getStartgame().setActionCommand("start");
        gm.getRestart().setActionCommand("restart");
        gm.getOutgame().setActionCommand("exit");
        gm.getGame().setActionCommand("game");
        gm.getSelfgame().setActionCommand("self");
        gm.getStartgame().addActionListener(sa);
        gm.getRestart().addActionListener(sa);
        gm.getOutgame().addActionListener(sa);
        gm.getGame().addActionListener(sa);
        gm.getSelfgame().addActionListener(sa);

    }


    public GameMeun getGm() {
        return gm;
    }


    public void setGm(GameMeun gm) {
        this.gm = gm;
    }


    public GameArea getGa() {
        return ga;
    }


    public void setGa(GameArea ga) {
        this.ga = ga;
    }

}
