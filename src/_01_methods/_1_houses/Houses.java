package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

public class Houses {
	static Robot rob = new Robot();
		public static void main(String[] args) {
			
		 rob.penDown();
		 rob.setX(100);
		 rob.setY(550);
		 rob.setSpeed(40);
		 for(int i = 0; i < 9; i++) {
			 String size = " ";
			 Random gen = new Random();
			 int num = gen.nextInt(3);
			 if(num==0) {
				 size= "small";
			 }
			 else if (num==1) {
				 size= "medium";
			 }
			 else {
				 size = "large";
			 }
			 drawRectangle(size);
		 }
		}
		 static void drawRectangle(String size) {
				rob.setPenColor(250,0,0);
			 int height=0;
			 if(size.equals("small")) {
				 height = 60;
			 }
			 else if(size.equals("medium")) {
				 height = 120;
			 }
			 else if(size.equals("large")) {
				 height = 250;
			 }
			 rob.move(height);
			 if(size.equals("large")) {
				 drawFlatRoof();
			 }
			 else {
				 drawPointyRoof();
			 }
			
			 rob.move(height);
			 rob.turn(-90);
			 rob.move(30);
			 rob.turn(-90);
		
		}
	static void drawPointyRoof() {
		
		rob.turn(45);
		rob.move(15);
		rob.turn(90);
		rob.move(15);
		rob.turn(45);
		
		
		
	}
	static void drawFlatRoof() {
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
	}
		
		 
	public void run() {
	

		// Check the recipe to find out what code to put here
	}
}
