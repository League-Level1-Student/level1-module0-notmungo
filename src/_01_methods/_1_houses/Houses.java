package _01_methods._1_houses;

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
		 for(int i = 0; i < 9; i++) {
			 drawRectangle();
		 }
		}
		 static void drawRectangle() {
			 rob.move(100);
			 rob.turn(90);
			 rob.move(30);
			 rob.turn(90);
			 rob.move(100);
			 rob.turn(180);
			 rob.move(30);
			 rob.turn(90);
		 
		 
		}
		
		 
	public void run() {
	

		// Check the recipe to find out what code to put here
	}
}
