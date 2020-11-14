package com.lele.model;

import com.lele.data.Data;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public abstract class Enemy {
      protected int x;
      protected int y;
      protected int type;
      protected int oldX;
      protected int hp=100;
      public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	protected int oldY;
      private int[][]map;
      private Map map1;
      protected Enemy() {
    	  map=getMap1().map1;
		
	}
	 public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Map getMap1() {
		return map1;
	}
	public void setMap1(Map map1) {
		this.map1 = map1;
	}
	public int[][] getMap() {
		return map;
	}
	public void setMap(int[][] map) {
		this.map = map;
	}
	protected int speed;
     protected int Diretion;
	public Enemy(int x, int y,int Diretion,int oldX,int oldY,int hp) {
		super();
		this.x = x;
		this.y = y;
		this.oldX = x;
		this.oldY = y;
		this.Diretion=Diretion;
		this.hp=hp;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public abstract void draw(Graphics g);
	public abstract void moveup();
	public abstract void movedown();
	public abstract void moveleft();
	public abstract void moveright();
	public int getDiretion() {
		return Diretion;
	}
	public void setDiretion(int diretion) {
		Diretion = diretion;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getOldX() {
		return oldX;
	}
	public void setOldX(int oldX) {
		this.oldX = oldX;
	}
	public int getOldY() {
		return oldY;
	}
	public void setOldY(int oldY) {
		this.oldY = oldY;
	}
	private  void changToOldDir() {  
		x = oldX;
		y = oldY;
	}
	
	public Rectangle geRectangle() {
	   return new Rectangle(x, y, x+40, y+40);   
		   }
        public static boolean playertoenemy(List<Enemy>enemies) {
    	boolean is=false;
    	for (int i = 0; i < Data.enemyList.size(); i++) {
		Enemy enemy =Data.enemyList.get(i);
		Rectangle enemyRectangle=new Rectangle(enemy.getX(), enemy.getY(), 40, 40);
		if(enemyRectangle.intersects(new Rectangle(Data.player.getX(), Data.player.getY(), 40, 40))) {
			enemy.changToOldDir();
			is=true;
			break;
		}
		}
		return is;
		
	}
        public boolean palytomap(int[][] map2,List<Enemy>enemies) {
       	 boolean is=false;;
       	 this.map=map2;
       	 for (int i = 0; i < map.length; i++) {
       			for (int j = 0; j < map[i].length; j++) {
       				for (int k = 0; k < Data.enemyList.size(); k++) {
       					Enemy enemy =Data.enemyList.get(k);
       				Rectangle enemyRectangle=new Rectangle(enemy.getX(), enemy.getY(), 40, 40);
       				Rectangle mapRectangle=new Rectangle(i*40,j*40,40,40);
       				if(mapRectangle.intersects(enemyRectangle)) {
       					if(map[j][i]==1) {
       						this.changToOldDir();
       						is=true;
       					}
       					if(map[j][i]==3) {
       						this.changToOldDir();
       						is=true;
       					}
       					if(map[j][i]==4) {
       						this.changToOldDir();
       						is=true;
       					}
       				}
       			}
       			}
       	 }
   		return false;
       }
	}
