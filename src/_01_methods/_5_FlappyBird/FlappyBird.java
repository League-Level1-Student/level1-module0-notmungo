package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 60;
    int y = 60;
    int birdYVelocity = -10;
    int gravity = -4;
    int x2 = 25;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
     background(255,255,255);
     fill(255,255,255);
     stroke(60,60,60);
     fill(0,0,255);
     ellipse(x,y, 60,60);
     
     y -= gravity;
     fill(0,255,50);
     rect(x2,0, 50,150);
     x2 -= 10;
    }
   public void mousePressed() {
	birdYVelocity = 20;
	y -= birdYVelocity;
	
}
   public void teleportPipes() {
	   
   }
   
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
