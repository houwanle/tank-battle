package com.lele.model;

import com.lele.data.Data;

import java.awt.Graphics;

public class YellowEnemy extends Enemy{
	   private int speed =8;
	   protected   int type=3;
	   private int hp=100;
	   public int getType() {
		return type;
	}

	public  void setType(int type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public YellowEnemy() {
		super();
	}
	private static int count =300;
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public YellowEnemy(int x, int y, int Diretion,int oldX,int oldY,int hp) {
		super(x, y, Diretion,oldX,oldY,hp);
		this.x = x;
		this.y = y;
		this.Diretion=Diretion;
		this.oldX=oldX;
		this.oldY=oldY;
		this.hp=hp;
	}
    
	@Override
	public void draw(Graphics g) {
		if(getDiretion()==0) {
			g.drawImage(Data.IMG_yellowUp, x, y, x+40, y+40, 0, 0, 60, 60, null);
		}
		if(getDiretion()==1) {
			g.drawImage(Data.IMG_yellowDown, x, y, x+40, y+40, 0, 0, 60, 60, null);
		}
		if(getDiretion()==2) {
			g.drawImage(Data.IMG_yellowLeft, x, y, x+40, y+40, 0, 0, 60, 60, null);
		}
		if(getDiretion()==3) {
			g.drawImage(Data.IMG_yellowRight, x, y, x+40, y+40, 0, 0, 60, 60, null);
		}
		}

	@Override
	public void moveup() {
		if (getDiretion()==0) {
			this.oldX = x;
			this.oldY = y;
			y-=speed;

		}
	}
	public void movedown() {
		if (getDiretion()==1) {
			this.oldX = x;
			this.oldY = y;
			y+=speed;


		}
	}
	public void moveleft() {
		if (getDiretion()==2) {
			this.oldX = x;
			this.oldY = y;
			x-=speed;


		}
	}
	public void moveright() {
		if (getDiretion()==3) {
			this.oldX = x;
			this.oldY = y;
			x+=speed;

		}
	}
	}

