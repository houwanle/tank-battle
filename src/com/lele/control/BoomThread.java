package com.lele.control;

import com.lele.data.Data;
import com.lele.model.*;
import com.lele.view.GameFrame;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 爆炸的线程
 */
public class BoomThread extends Thread {

	private GameFrame f;

	public BoomThread(GameFrame f) {
		super();
		this.f = f;
	}
	

	@Override
	public void run() {
		int hp= Player.getHP();
        while(true) {
        	JLabel lab = new JLabel(new ImageIcon("image/bz.png"));
          if(Data.pouse==0) {
        	  for (int i = 0; i < Data.zdList.size(); i++) {
				Bullet bullet= Data.zdList.get(i);
        	  for (int j = 0; j < Data.enemyList.size(); j++) {
			  Enemy enemy=Data.enemyList.get(j);
			  Rectangle rebullet =new Rectangle(bullet.getX(), bullet.getY(), 15, 15);
			  Rectangle reenemy =new Rectangle(enemy.getX(), enemy.getY(), 40, 40);
			  if(rebullet.intersects(reenemy)) {
				  Data.zdList.remove(bullet);
				 int enemyhp= enemy.getHp();
				 enemyhp-=30;
				 enemy.setHp(enemyhp);
				 System.out.println(enemy.getHp());
				 if(enemyhp<0) {
				 boolean is=  Data.enemyList.remove(enemy);
               if(enemy.getType()==new YellowEnemy().getType()) {
            	   Data.count+=YellowEnemy.getCount();
               }
               if(enemy.getType()==new BuleEnemy().getType()) {
            	   Data.count+=BuleEnemy.getCount();
               }
               if(enemy.getType()==new PinkEnemy().getType()) {
            	   Data.count+=PinkEnemy.getCount();
               }

				  lab.setBounds(enemy.getX(), enemy.getY(), 40, 40);
				  f.getGa().add(lab);
			  if(is==true) {
				  Data.hit++;
			  }
			  }
			  }
			}
        	  }	  
        	  for (int i = 0; i < Data.enzdList.size(); i++) {
				EnBullet bullet= Data.enzdList.get(i);
			  Rectangle rebullet =new Rectangle(bullet.getX(), bullet.getY(), 15, 15);
			  Rectangle reenemy =new Rectangle(Data.player.getX(), Data.player.getY(), 40, 40);
			  if(rebullet.intersects(reenemy)) {
				  Data.zdList.remove(bullet);
				  lab.setBounds(Data.player.getX(), Data.player.getY(), 40, 40);
				  Data.player.setX(200);
				  Data.player.setY(560);
				  hp--;
				  Data.player.setHP(hp);
				  System.out.println(hp);
				  f.getGa().add(lab);
			  }
			}
        	  }	
		try {
			Thread.sleep(80);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}


		f.getGa().remove(lab);
        }
        }

	}

