package com.gandilong;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Gamer extends JFrame{

	private static final long serialVersionUID = 7369300178071038225L;

	
	public Gamer(){
		init();
	}
	
	public void init(){
		setSize(500, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void start(){
		setVisible(true);
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Color c=g.getColor();
		
		//初始化场景
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 500, 600);
		
		//恢复画笔
		g.setColor(c);
	}
	
	
	
	public static void main(String[] args) {
		//设置样式
		 try {
	         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	             if ("Nimbus".equals(info.getName())) {
	                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                 break;
	             }
	         }
	     } catch (Exception ex) {
	         java.util.logging.Logger.getLogger(Gamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	     }
		 
		 //安全启动
	     java.awt.EventQueue.invokeLater(new Runnable() {
	         public void run() {
	        	 Gamer gamer=new Gamer();
	        	 gamer.start();
	         }
	     });
		
	}

}
