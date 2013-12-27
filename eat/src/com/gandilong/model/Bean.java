package com.gandilong.model;

import java.awt.Rectangle;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;


/**
 * 豆子
 * @author gandilong
 *
 */
public class Bean {

	private int xPos;
	private int yPos;
	private int type;//豆子的类别：0普通豆子，1能量豆
	private Rectangle bean;

	private static Bean[] beans=null; 
	
	public Bean(int x,int y,int type){
		this.xPos=x;
		this.yPos=y;
		this.type=type;
		bean=new Rectangle(xPos - 2, yPos - 2, 5, 5);
	}
	
	public void draw(Graphics g){
	   
		Color c=g.getColor();
	    g.setColor(Color.yellow);
	    
		if(1==type){
			g.fillOval(xPos - 2, yPos - 2, 4, 4);
		}
		
		if(2==type){
			g.fillOval(xPos - 4, yPos - 4, 9, 9);
		}
		g.setColor(c);
	}

	public Rectangle getBorder(){
		return bean;
	}

	public boolean bigBean(){
		return 2==type;
	}
	
	public static Bean[] beans(){

		if(null!=beans){
			return beans;
		}
		
		Bean[] beans = new Bean[157];
		for(int i = 0; i < 8; i++){
			beans[i] = new Bean(42 + (i - 0)*21, 42, 1);
		}
		for(int i = 8; i < 16; i++){
			beans[i] = new Bean(231 + (i - 8)*21, 42, 1);
		}
		beans[16] = new Bean(42, 63, 2);
		beans[17] = new Bean(378, 63, 2);
		beans[18] = new Bean(189, 63, 1);
		beans[19] = new Bean(189, 84, 1);
		beans[20] = new Bean(231, 63, 1);
		beans[21] = new Bean(231, 84, 1);
		for(int i = 22; i < 26; i++){
			beans[i] = new Bean(42, 84 + (i - 22)*21, 1);
		}
		for(int i = 26; i < 30; i++){
			beans[i] = new Bean(378, 84 + (i - 26)*21, 1);
		}
		beans[30] = new Bean(63, 105, 1);
		beans[31] = new Bean(84, 105, 1);
		beans[32] = new Bean(336, 105, 1);
		beans[33] = new Bean(357, 105, 1);
		for(int i = 34; i < 43; i++){
			beans[i] = new Bean(126 + (i - 34)*21, 105, 1);
		}
		for(int i = 43; i < 60; i++){
			beans[i] = new Bean(105, 63 + (i - 43)*21, 1);
		}
		for(int i = 60; i < 77; i++){
			beans[i] = new Bean(315, 63 + (i - 60)*21, 1);
		}
		beans[77] = new Bean(63, 147, 1);
		beans[78] = new Bean(84, 147, 1);
		beans[79] = new Bean(336, 147, 1);
		beans[80] = new Bean(357, 147, 1);
		beans[81] = new Bean(147, 126, 1);
		beans[82] = new Bean(273, 126, 1);
		
		for(int i = 83; i < 86; i++){
			beans[i] = new Bean(147 + (i - 83)*21, 147, 1);
		}
		for(int i = 86; i < 89; i++){
			beans[i] = new Bean(231 + (i - 86)*21, 147, 1);
		}
		beans[89] = new Bean(42, 315, 1);
		beans[90] = new Bean(42, 336, 1);
		beans[91] = new Bean(42, 357, 2);
		for(int i = 92; i < 95; i++){
			beans[i] = new Bean(63, 357 + (i - 92)*21, 1);
		}
		for(int i = 95; i < 98; i++){
			beans[i] = new Bean(42, 399 + (i - 95)*21, 1);
		}
		beans[98] = new Bean(63, 315, 1);
		beans[99] = new Bean(84, 315, 1);
		for(int i = 100; i < 104; i++){
			beans[i] = new Bean(126 + (i - 100)*21, 315, 1);
		}
		for(int i = 104; i < 108; i++){
			beans[i] = new Bean(231 +(i - 104)*21, 315, 1);
		}
		beans[108] = new Bean(189, 336, 1);
		beans[109] = new Bean(231, 336, 1);
		for(int i = 110; i < 119; i++){
			beans[i] = new Bean(126 + (i - 110)*21, 357, 1);
		}
		for(int i = 119; i < 122; i++){
			beans[i] = new Bean(336 + (i - 119)*21, 315, 1);
		}
		beans[122] = new Bean(378, 336, 1);
		beans[123] = new Bean(378, 357, 2);
		for(int i = 124; i < 127; i++){
			beans[i] = new Bean(357, 357 + (i - 124)*21, 1);
		}
		for(int i = 127; i < 130; i++){
			beans[i] = new Bean(378, 399 + (i - 127)*21, 1);
		}
		beans[130] = new Bean(84, 399, 1);
		beans[131] = new Bean(336, 399, 1);
		beans[132] = new Bean(147, 378, 1);
		beans[133] = new Bean(189, 420, 1);
		beans[134] = new Bean(273, 378, 1);
		beans[135] = new Bean(231, 420, 1);
		for(int i = 136; i < 139; i++){
			beans[i] = new Bean(147 + (i - 136)*21, 399, 1);
		}
		for(int i = 139; i < 142; i++){
			beans[i] = new Bean(231 + (i - 139)*21, 399, 1);
		}
		for(int i = 142; i < 157; i++){
			beans[i] = new Bean(63 + (i - 142)*21, 441, 1);
		}
		return beans;
	
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public Rectangle getBean() {
		return bean;
	}

	public void setBean(Rectangle bean) {
		this.bean = bean;
	}
	
}
