package com.gandilong.model;

import java.awt.Rectangle;

import org.newdawn.slick.Image;

/**
 * 墙壁
 * @author gandilong
 *
 */
public class Wall {

	private int xPos;
	private int yPos;
	private int IndexOfImage;
	private Rectangle wallRec;
	
	private static Wall[] walls=null;
	private static Image[] wallImages=null;
	
	public Wall(int x,int y,int index){
		this.xPos=x;
		this.yPos=y;
		this.IndexOfImage=index;
	}
	
	
	public static Wall[] backgroundWall(){

		if(null!=walls){
			return walls;
		}
		
		walls=new Wall[216];
		
		walls[0] = new Wall(21, 21, 29);
		walls[1] = new Wall(399, 21, 30);
		walls[2] = new Wall(21, 462, 28);
		walls[3] = new Wall(399, 462, 31);

		for(int i = 4; i < 12; i++){
			walls[i] = new Wall(42 + (i - 4)*21, 21, 27);
		}
		
		walls[12] = new Wall(210, 21, 22);
		for(int i = 13; i < 21; i++){
			walls[i] = new Wall(231 + (i - 13)*21, 21, 27);
		}

		walls[21] = new Wall(210, 42, 2);
		walls[22] = new Wall(210, 63, 2);
		walls[23] = new Wall(210, 84, 5);

		for(int i = 24; i < 30; i++){
			walls[i] = new Wall(21, 42 + 21*(i - 24), 26);
		}

		walls[30] = new Wall(63, 63, 32);
		walls[31] = new Wall(84, 63, 33);
		walls[32] = new Wall(63, 84, 35);
		walls[33] = new Wall(84, 84, 34);

		walls[34] = new Wall(63, 126, 6);
		walls[35] = new Wall(84, 126, 4);

		walls[36] = new Wall(126, 63, 32);
		walls[37] = new Wall(126, 84, 35);
		walls[38] = new Wall(147, 63, 19);
		walls[39] = new Wall(147, 84, 17);
		walls[40] = new Wall(168, 63, 33);
		walls[41] = new Wall(168, 84, 34);

		walls[42] = new Wall(252, 63, 32);
		walls[43] = new Wall(252, 84, 35);
		walls[44] = new Wall(273, 63, 19);
		walls[45] = new Wall(273, 84, 17);
		walls[46] = new Wall(294, 63, 33);
		walls[47] = new Wall(294, 84, 34);

		walls[48] = new Wall(336, 63, 32);
		walls[49] = new Wall(357, 63, 33);
		walls[50] = new Wall(336, 84, 35);
		walls[51] = new Wall(357, 84, 34);

		walls[52] = new Wall(336, 126, 6);
		walls[53] = new Wall(357, 126, 4);

		for(int i = 54; i < 60; i++){
			walls[i] = new Wall(399, 42 + (i - 54)*21, 24);
		}

		walls[60] = new Wall(21, 168, 28);
		walls[61] = new Wall(42, 168, 25);
		walls[62] = new Wall(63, 168, 25);
		walls[63] = new Wall(84, 168, 37);
		walls[64] = new Wall(84, 189, 26);
		walls[65] = new Wall(84, 210, 38);
		for(int i = 66; i < 69; i++){
			walls[i] = new Wall(63 - (i - 66)*21, 210, 27);
		}

		for(int i = 69; i < 72; i++){
			walls[i] = new Wall(21 + (i - 69)*21, 252, 25);
		}
		walls[72] = new Wall(84, 252, 37);
		walls[73] = new Wall(84, 273, 26);
		walls[74] = new Wall(84, 294, 38);
		walls[75] = new Wall(63, 294, 27);
		walls[76] = new Wall(42, 294, 27);

		walls[77] = new Wall(126, 126, 3);
		walls[78] = new Wall(126, 147, 2);
		walls[79] = new Wall(126, 168, 13);
		walls[80] = new Wall(147, 168, 1);
		walls[81] = new Wall(168, 168, 4);
		walls[82] = new Wall(126, 189, 2);
		walls[83] = new Wall(126, 210, 5);

		walls[84] = new Wall(168, 126, 6);
		walls[85] = new Wall(189, 126, 1);
		walls[86] = new Wall(210, 126, 14);
		walls[87] = new Wall(231, 126, 1);
		walls[88] = new Wall(252, 126, 4);
		walls[89] = new Wall(210, 147, 2);
		walls[90] = new Wall(210, 168, 5);

		walls[91] = new Wall(294, 126, 3);
		walls[92] = new Wall(294, 147, 2);
		walls[93] = new Wall(294, 168, 15);
		walls[94] = new Wall(273, 168, 1);
		walls[95] = new Wall(252, 168, 6);
		walls[96] = new Wall(294, 189, 2);
		walls[97] = new Wall(294, 210, 5);

		walls[98] = new Wall(399, 168, 31);
		walls[99] = new Wall(378, 168, 25);
		walls[100] = new Wall(357, 168, 25);
		walls[101] = new Wall(336, 168, 36);
		walls[102] = new Wall(336, 189, 24);
		walls[103] = new Wall(336, 210, 39);
		for(int i = 104; i < 107; i++){
			walls[i] = new Wall(357 + (i - 104)*21, 210, 27);
		}

		for(int i = 107; i < 110; i++){
			walls[i] = new Wall(357 + (i -  107)*21, 252, 25);
		}
		
		walls[110] = new Wall(336, 252, 36);
		walls[111] = new Wall(336, 273, 24);
		walls[112] = new Wall(336, 294, 39);
		walls[113] = new Wall(357, 294, 27);
		walls[114] = new Wall(378, 294, 27);

		walls[115] = new Wall(168, 210, 40);
		walls[116] = new Wall(168, 231, 44);
		walls[117] = new Wall(168, 252, 43);
		for(int i = 118; i < 121; i++){
			walls[i] = new Wall(189 + (i - 118)*21, 252, 47);
		}
		walls[121] = new Wall(252, 252, 42);
		walls[122] = new Wall(252, 231, 46);
		walls[123] = new Wall(252, 210, 41);

		walls[124] = new Wall(126, 252, 3);
		walls[125] = new Wall(126, 273, 2);
		walls[126] = new Wall(126, 294, 5);
		walls[127] = new Wall(294, 252, 3);
		walls[128] = new Wall(294, 273, 2);
		walls[129] = new Wall(294, 294, 5);

		walls[130] = new Wall(21, 294, 29);
		for(int i = 131; i < 134; i++){
			walls[i] = new Wall(21, 315 + (i - 131)*21, 26);
		}
		
		walls[134] = new Wall(21, 378, 21);
		for(int i = 135; i < 138; i++){
			walls[i] = new Wall(21, 399 + (i - 135)*21, 26);
		}

		walls[138] = new Wall(399, 294, 30);
		for(int i = 139; i < 142; i++){
			walls[i] = new Wall(399, 315 + (i - 139)*21, 24);
		}
		
		walls[142] = new Wall(399, 378, 23);
		for(int i = 143; i < 146; i++){
			walls[i] = new Wall(399, 399 + (i - 143)*21, 24);
		}

		for(int i = 146; i < 163; i++){
			walls[i] = new Wall(42 + (i - 146)*21, 462, 25);
		}

		walls[163] = new Wall(42, 378, 4);
		walls[164] = new Wall(378, 378, 6);

		walls[165] = new Wall(168, 294, 6);
		walls[166] = new Wall(189, 294, 1);
		walls[167] = new Wall(210, 294, 14);
		walls[168] = new Wall(231, 294, 1);
		walls[169] = new Wall(252, 294, 4);
		walls[170] = new Wall(210, 315, 2);
		walls[171] = new Wall(210, 336, 5);

		walls[172] = new Wall(168, 378, 6);
		walls[173] = new Wall(189, 378, 1);
		walls[174] = new Wall(210, 378, 14);
		walls[175] = new Wall(231, 378, 1);
		walls[176] = new Wall(252, 378, 4);
		walls[177] = new Wall(210, 399, 2);
		walls[178] = new Wall(210, 420, 5);

		walls[179] = new Wall(126, 336, 6);
		walls[180] = new Wall(147, 336, 1);
		walls[181] = new Wall(168, 336, 4);
		walls[182] = new Wall(252, 336, 6);
		walls[183] = new Wall(273, 336, 1);
		walls[184] = new Wall(294, 336, 4);

		walls[185] = new Wall(63, 336, 6);
		walls[186] = new Wall(84, 336, 9);
		walls[187] = new Wall(84, 357, 2);
		walls[188] = new Wall(84, 378, 5);

		walls[189] = new Wall(336, 336, 8);
		walls[190] = new Wall(336, 357, 2);
		walls[191] = new Wall(336, 378, 5);
		walls[192] = new Wall(357, 336, 4);

		walls[193] = new Wall(63, 420, 6);
		walls[194] = new Wall(84, 420, 1);
		walls[195] = new Wall(105, 420, 1);
		walls[196] = new Wall(126, 420, 12);
		walls[197] = new Wall(147, 420, 1);
		walls[198] = new Wall(168, 420, 4);
		walls[199] = new Wall(126, 399, 2);
		walls[200] = new Wall(126, 378, 3);

		walls[201] = new Wall(252, 420, 6);
		walls[202] = new Wall(273, 420, 1);
		walls[203] = new Wall(294, 420, 12);
		walls[204] = new Wall(315, 420, 1);
		walls[205] = new Wall(336, 420, 1);
		walls[206] = new Wall(357, 420, 4);
		walls[207] = new Wall(294, 399, 2);
		walls[208] = new Wall(294, 378, 3);

		walls[209] = new Wall(0, 210, 1);
		walls[210] = new Wall(0, 252, 1);
		walls[211] = new Wall(420, 210, 1);
		walls[212] = new Wall(420, 252, 1);
		walls[213] = new Wall(189, 210, 1);
		walls[214] = new Wall(210, 210, 1);
		walls[215] = new Wall(231, 210, 1);
		
		return walls;
	}
	
	public static Image[] wallImages(){
		
		if(null!=wallImages){
			return wallImages;
		}
		
		wallImages= new Image[47];
		try{
		    for(int i = 0; i < 47; i++){
		    	wallImages[i] = new Image("image\\" + "wall" + (i + 1) + ".jpg");
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return wallImages;
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
	public int getIndexOfImage() {
		return IndexOfImage;
	}
	public void setIndexOfImage(int indexOfImage) {
		IndexOfImage = indexOfImage;
	}
	public Rectangle getWallRec() {
		return wallRec;
	}
	public void setWallRec(Rectangle wallRec) {
		this.wallRec = wallRec;
	}
	
}
