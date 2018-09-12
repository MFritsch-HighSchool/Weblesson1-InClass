/**
   @Author: Matthew Fritsch
      Date: September 2015
   Teacher: Richard Hanson
  */

import java.util.*;

import javax.swing.JOptionPane;

public class WebLesson1 {
	
	public static void main(String args[]) {
		HouseDrawer hd = new HouseDrawer();
		// get user input ask for the user to input the location (x,y) 
		// dimensions of the house

		hd.drawHouse(-200, 100, 100, 50);// draws house at (-200, 100) and
										// 100 wide and 50 high
		
		hd.drawHouse(50, -200, 100, 200);// draws a house at (50, -200) 
		      							 // 100 wide and 200 tall
		hd.drawHouse(100,100,30,100);

	}
}