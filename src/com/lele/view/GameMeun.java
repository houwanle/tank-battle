package com.lele.view;

import javax.swing.*;

public class GameMeun extends JMenuBar {
    private JMenu gameMeun;
    private JMenu helpMenu;
    private JMenuItem startgame;
    private JMenuItem restart;
    private JMenuItem selfgame;
    private JMenuItem outgame;
    private JMenuItem game;
    private GameFrame gf;

    public JMenuItem getGame() {
        return game;
    }

    public void setGame(JMenuItem game) {
        this.game = game;
    }

    public GameMeun(GameFrame gameFrame) {
        this.gf = gameFrame;
        gameMeun = new JMenu("游戏");
        helpMenu = new JMenu("帮助");
        startgame = new JMenuItem("开始游戏");
        restart = new JMenuItem("重新开始");
        selfgame = new JMenuItem("自定义");
        game = new JMenuItem("游戏说明");
        outgame = new JMenuItem("退出");
        this.add(gameMeun);
        this.add(helpMenu);
        gameMeun.add(startgame);
        gameMeun.add(restart);
        gameMeun.add(selfgame);
        gameMeun.add(outgame);
        helpMenu.add(game);
        restart.setEnabled(false);
    }

    public GameMeun() {
        super();
    }

    public JMenu getGameMeun() {
        return gameMeun;
    }

    public void setGameMeun(JMenu gameMeun) {
        this.gameMeun = gameMeun;
    }

    public JMenu getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(JMenu helpMenu) {
        this.helpMenu = helpMenu;
    }

    public JMenuItem getStartgame() {
        return startgame;
    }

    public void setStartgame(JMenuItem startgame) {
        this.startgame = startgame;
    }

    public JMenuItem getRestart() {
        return restart;
    }

    public void setRestart(JMenuItem restart) {
        this.restart = restart;
    }

    public JMenuItem getSelfgame() {
        return selfgame;
    }

    public void setSelfgame(JMenuItem selfgame) {
        this.selfgame = selfgame;
    }

    public JMenuItem getOutgame() {
        return outgame;
    }

    public void setOutgame(JMenuItem outgame) {
        this.outgame = outgame;
    }
}
