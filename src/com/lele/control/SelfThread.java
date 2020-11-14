package com.lele.control;

import com.lele.data.Data;
import com.lele.model.BuleEnemy;
import com.lele.model.PinkEnemy;
import com.lele.model.YellowEnemy;
import com.lele.view.GameSelf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelfThread implements ActionListener {
	private static int speed1=1;
	private static int speed2=1;
	private static int speed3=1;
	private static int level=1;
    private GameSelf g;
    public SelfThread(GameSelf g) {
        super();
        this.g = g;
    }
    public void actionPerformed(ActionEvent e) {
        String selfthread = e.getActionCommand();
        if (selfthread.equals("jiandan")) {
        	speed1=5;
        	speed2=2;
        	speed3=3;
        }
        if (selfthread.equals("zhongdeng")) {
            speed1=10;
        	speed2=8;
        	speed3=5;
        }
        if (selfthread.equals("kunnan")) {
            speed1=12;
        	speed2=10;
        	speed3=7;
        }
        if (selfthread.equals("level1")) {
            level = 1;
        }
        if (selfthread.equals("level2")) {
           level = 2;
        }
        if (selfthread.equals("level3")) {
            level = 3;
        }
        if (selfthread.equals("ok")) {
            g.dispose();
            new YellowEnemy().setSpeed(speed1);
            new BuleEnemy().setSpeed(speed2);
            new PinkEnemy().setSpeed(speed3);
            Data.levle=level;
            Data.initenemy(GameSelf.num);
        }
        if (selfthread.equals("cancle")) {
            System.exit(0);
        }

    }

}
