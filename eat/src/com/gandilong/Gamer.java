package com.gandilong;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.DoubleClickTest;
import org.newdawn.slick.tests.ImageTest;
import org.newdawn.slick.tests.TestBox;

import com.gandilong.model.Bean;
import com.gandilong.model.Wall;

/**
 * 运行游戏
 * @author gandilong
 *
 */
public class Gamer extends BasicGame{

	private int gameFlow;
	
	public Gamer(){
		super("Eat");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.translate(100, 50);
		for(Wall wall:Wall.backgroundWall()){
			Wall.wallImages()[wall.getIndexOfImage()-1].draw(wall.getxPos()-10,wall.getyPos()-10);
		}
		
		for(Bean bean:Bean.beans()){
			if(null!=bean&& !(bean.bigBean()&&gameFlow%16 > 7)){
				bean.draw(g);
			}
		}
		
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		
	}

	@Override
	public void update(GameContainer gc, int arg1) throws SlickException {
		
	}

	
	public static void main(String[] args) {
		//TestBox.main(args);
		//DoubleClickTest.main(null);
		//ImageTest.main(args);
		try {
			AppGameContainer appGameContainer=new AppGameContainer(new Gamer());
			appGameContainer.setDisplayMode(800, 600, false);
			appGameContainer.start();
		} catch (SlickException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
