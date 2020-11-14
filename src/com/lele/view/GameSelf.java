package com.lele.view;

import com.lele.control.SelfThread;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class GameSelf extends JFrame{
	public static int num=0;
	private SelfThread st= new SelfThread(this);
        public GameSelf () {
        	this.setSize(450, 400);
        	this.setTitle("自定义面板");
        	JLabel j1=new JLabel("游戏难度：");
        	JLabel j2=new JLabel("选择关卡：");
        	JLabel j3=new JLabel("请输入敌人的数量：");
        	JRadioButton bu= new JRadioButton("简单");
        	JRadioButton bu1= new JRadioButton("中等");
        	JRadioButton bu2= new JRadioButton("困难");
        	ButtonGroup bGroup=new ButtonGroup();
        	bGroup.add(bu);
        	bGroup.add(bu1);
        	bGroup.add(bu2);
        	final JTextArea t1=new JTextArea("0");
        	JRadioButton bu3= new JRadioButton("第一关");
        	JRadioButton bu4= new JRadioButton("第二关");
        	JRadioButton bu5= new JRadioButton("第三关");
        	ButtonGroup bGroup1=new ButtonGroup();
        	bGroup1.add(bu3);
        	bGroup1.add(bu4);
        	bGroup1.add(bu5);
//        	Data.num= Integer.valueOf(t1.getText());
            bu.setBounds(170, 60, 50, 20);
            bu1.setBounds(220, 60, 50, 20);
            bu2.setBounds(270, 60, 50, 20);
            bu3.setBounds(170, 120, 80, 20);
            bu4.setBounds(250, 120, 80, 20);
            bu5.setBounds(330, 120, 80, 20);
        	t1.setBounds(180, 180, 150, 20);
        	j1.setBounds(60, 20, 100, 100);
        	j2.setBounds(60, 80, 100, 100);
        	j3.setBounds(60, 140, 120, 100);
    		JButton ok=new JButton("确定");
    		ok.setBounds(100,250,80,30);	
    		JButton cancle=new JButton("取消");
    		cancle.setBounds(230,250,80,30);	
    		
    		this.add(bu2);
    		this.add(bu1);
    		this.add(bu);
    		this.add(bu3);
    		this.add(bu4);
    		this.add(bu5);
    		this.add(ok);
    		this.add(cancle);
    		this.add(t1);
        	this.add(j1);
        	this.add(j2);
        	this.add(j3);
           

           cancle.setActionCommand("cancle");
           ok.setActionCommand("ok");
           bu.setActionCommand("jiandan");
           bu1.setActionCommand("zhongdeng");
           bu2.setActionCommand("kunnan");
           bu3.setActionCommand("level1");
           bu4.setActionCommand("level2");
           bu5.setActionCommand("level3");
           
           ok.addActionListener(st);
           cancle.addActionListener(st);
           bu.addActionListener(st);
           bu1.addActionListener(st);
           bu2.addActionListener(st);
           bu3.addActionListener(st);
           bu4.addActionListener(st);
           bu5.addActionListener(st);
           t1.addAncestorListener(new AncestorListener() {
			
			public void ancestorRemoved(AncestorEvent event) {
				num=Integer.parseInt(t1.getText());
				System.out.println(t1.getText());
			}
			
			public void ancestorMoved(AncestorEvent event) {
				
			}
			
			public void ancestorAdded(AncestorEvent event) {
				
				
			}
		});
           this.setLayout(null);
    	   this.setResizable(false);
    	   this.setLocationRelativeTo(null);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setVisible(true); 
        }


}
