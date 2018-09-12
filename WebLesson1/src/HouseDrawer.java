import apcslib.*;
import java.awt.*;
import java.util.Random;

import javax.swing.JOptionPane;

public class HouseDrawer {
	private DrawingTool pen = new DrawingTool();
	/**
	 * Method drawHouse
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	public void drawHouse(int x, int y, int w, int h) {
		drawFrame(x,y,w,h);
		drawRoof(x,y,w,h);
		drawWindow1(x,y,w,h);
		drawWindow2(x,y,w,h);
		drawDoor(x,y,w,h);
		drawChimney(x,y,w,h);
		drawSmoke(x,y,w,h);
		drawLawn(x,y,w,h);
		drawPath(x,y,w,h);
	}

	/**
	 * Method drawFrame
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	private void drawFrame(int x, int y, int w, int h) {
		pen.up();
		getRandColor();
		pen.move(x, y);
		pen.down();
		pen.drawRect(w, h);
		pen.up();
	}

	private void getRandColor() {
		Random rand = new Random();
		int red = rand.nextInt(256);
		int green = rand.nextInt(256);
		int blue = rand.nextInt(256);
		pen.setColor(new Color(red, green, blue));
	}

	/**
	 * Method drawRoof
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	private void drawRoof(int x, int y, int w, int h) {
		getRandColor();
		pen.move((w/2.000)+x ,(h/2.000)+y);
		pen.down();
		pen.turn(225);
		pen.move(x,y+h);
		pen.turn(90);
		pen.move(x-(w/2.00),(h/2.0)+y);
		pen.up();
	}

	/**
	 * Method drawWindow1
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	private void drawWindow1(int x, int y, int w, int h) {
		getRandColor();
		pen.move(x+(w/4.0),(y+(h/5.0)));
		pen.down();
		pen.drawRect(w/4.0,h/4.0);
		pen.setDirection(0);
		pen.up();
		pen.move(w/8.0);
		pen.setDirection(180);
		pen.down();
		pen.move(w/4.0);
		pen.up();
		pen.turn(180);
		pen.move(w/8.0);
		pen.setDirection(90);
		pen.move(h/8.0);
		pen.setDirection(270);
		pen.down();
		pen.move(h/4.0);
		pen.up();
	}
	/**
	 * Method drawWindow2
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	private void drawWindow2(int x, int y, int w, int h) {
		getRandColor();
		pen.move(x-(w/4.0),(y+(h/5.0)));
		pen.down();
		pen.drawRect(w/4.0,h/4.0);
		pen.setDirection(0);
		pen.up();
		pen.move(w/8.0);
		pen.setDirection(180);
		pen.down();
		pen.move(w/4.0);
		pen.up();
		pen.turn(180);
		pen.move(w/8.0);
		pen.setDirection(90);
		pen.move(h/8.0);
		pen.setDirection(270);
		pen.down();
		pen.move(h/4.0);
		pen.up();
	}

	/**
	 * Method drawDoor
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	private void drawDoor(int x, int y, int w, int h) {
		//x = 50
		//y = -200
		//w = 100
		//h = 200
		getRandColor();
		pen.move(x-(w/6), y-(h/2));
		pen.down();
		pen.move(x-(w/6), y-(h/5));
		pen.move(x+(w/6), y-(h/5));
		pen.move(x+(w/6), y-(h/2));
		pen.up();
		pen.move(x+(w/6), y-(h/3));
		pen.setDirection(180);
		pen.move(w/16.0);
		pen.down();
		pen.drawCircle(h/40.0);
		pen.up();
	}

	/**
	 * Method drawChimney
	 *
	 *
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 *
	 */
	private void drawChimney(int x, int y, int w, int h) {
		getRandColor();
		pen.move(((w)/3)+x,y+((h*2)/3));
		pen.down();
		pen.setDirection(90);
		pen.move(h/3.0);
		pen.up();
		pen.move((w/4)+x,((h*3)/4)+y);
		pen.down();
		pen.setDirection(90);
		pen.move(h/4.0);
		pen.up();
		pen.move(x+(w/4),h+y);
		pen.down();
		pen.setDirection(0);
		pen.move(w/12);
		pen.up();
	}
	
	private void drawSmoke(int x, int y, int w, int h) {
		//Middle of chimney top = x+(7w/24),((h*3)/4)+y
		//-200, 100, 100, 50
		Random smokelength = new Random();
		int smokel = smokelength.nextInt(8);
		Random smokeangle = new Random();
		int smokea = smokeangle.nextInt(40)+80;
		pen.move(x+(w/4)+(w/24),h+y);
		pen.setWidth(3);
		for(int s=0; s<8; s++){
			pen.setDirection(smokea);
			smokel = smokelength.nextInt(8);
			smokea = smokeangle.nextInt(40)+80;
			getRandColor();
			pen.down();
			pen.move(smokel);
			pen.up();
		}
		smokel = smokelength.nextInt(8);
		smokea = smokeangle.nextInt(40)+80;
		pen.move(x+(w/4)+(w/24),h+y);
		for(int t=0; t<12; t++){
			pen.setDirection(smokea);
			smokel = smokelength.nextInt(8);
			smokea = smokeangle.nextInt(40)+80;
			getRandColor();
			pen.down();
			pen.move(smokel);
			pen.up();
		}
		smokel = smokelength.nextInt(8);
		smokea = smokeangle.nextInt(40)+80;
		pen.move(x+(w/4)+(w/24),h+y);
		for(int u=0; u<16; u++){
			pen.setDirection(smokea);
			smokel = smokelength.nextInt(8);
			smokea = smokeangle.nextInt(40)+80;

			getRandColor();
			pen.down();
			pen.move(smokel);
			pen.up();
		}
		pen.setWidth(1);
	}
	
	private void drawLawn(int x, int y, int w, int h){
		int r=15;
		int g=168;
		int b=46;
		pen.move(x, y-h);
		pen.setColor(new Color(r,g,b));
		pen.down();
		pen.drawRect(w, h-1);
		pen.fillRect(w, h-1);
		pen.up();
	}
	
	private void drawPath(int x, int y, int w, int h){
		Random pathy = new Random();
		int path = pathy.nextInt(2);
		if(path == 1){
			pen.down();
			pen.setColor(Color.gray);
			pen.fillRect(w/4,h-1);
			pen.up();
		}
		else if(path == 2){
			pen.up();
		}
	}
	
}
