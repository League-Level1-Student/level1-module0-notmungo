package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		public static void main(String[] args) {
		Robot rob = new Robot();	
		 rob.penDown();
		 rob.setX(100);
		 rob.setY(500);
		 for(int i = 0; i == 9; i++) {
			 drawRectangle();
		 }
		}
		 static void drawRectangle() {
			 Robot rob = new Robot(); 
		 rob.penDown();
		 rob.turn(90);
		 rob.move(200);
		 rob.turn(90);
		 rob.move(40);
		 rob.turn(90);
		 rob.move(200);
		}
		
		 
	public void run() {
	

		// Check the recipe to find out what code to put here
	}
}
