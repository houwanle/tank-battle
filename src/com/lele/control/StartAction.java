package com.lele.control;

import com.lele.data.Data;
import com.lele.model.Player;
import com.lele.view.GameArea;
import com.lele.view.GameFrame;
import com.lele.view.GameSelf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartAction implements ActionListener {
    private GameFrame f;
    private GameArea ga;

    public StartAction(GameFrame f) {
        super();
        this.f = f;
    }

    public void actionPerformed(ActionEvent e) {
        String startaction = e.getActionCommand();
        if (startaction.equals("start")) {

            String title = JOptionPane.showInputDialog(null, "请输入姓名", "欢迎来到坦克大战", JOptionPane.PLAIN_MESSAGE);
            Data.name = title;
            Data.start = 1;
            Data.initenemy(3);
            f.getGm().getStartgame().setEnabled(false);
            f.getGm().getRestart().setEnabled(true);
        } else if (startaction.equals("restart")) {
            Data.enemyList.clear();
            Data.backlist.clear();
            Data.yellowcount.clear();
            Data.bulecount.clear();
            Data.pinkcount.clear();
            Data.stagelList.clear();
            Data.player.setX(200);
            Data.player.setY(560);
            Data.initenemy(3);

            Data.b = 0;
            Player.setHP(3);
            Data.isGameOver = true;
            Data.isRestart =true;


        } else if (startaction.equals("exit")) {
            System.exit(0);
        } else if (startaction.equals("game")) {
            JOptionPane.showMessageDialog(null,"用 W S A D控制方向，J键盘发射，P为暂停，O为继续。\n道具： 炸弹----使敌人消失    星星-----加速   爱心----增加生命值！\n制作不易请多多包含！！！",
                    "提示！", JOptionPane.INFORMATION_MESSAGE);

        } else if (startaction.equals("self")) {
            new GameSelf();
        }
    }

}
