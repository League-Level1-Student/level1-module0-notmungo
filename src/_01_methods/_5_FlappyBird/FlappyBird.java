package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 60;
    int y = 60;
    int birdYVelocity = -10;
    int gravity = -4;
    int x2 = 750;
    int upperPipeHeight = (int) random(100, 400);
    int pipeGap = 150;
    int lowery = upperPipeHeight + pipeGap;

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
     rect(x2,0, 50, upperPipeHeight);
     x2 -= 5;
     if(x2 <= 0) {
        x2 += 750;
        upperPipeHeight = (int) random(100, 400); 
        lowery = upperPipeHeight + pipeGap;
     }
     fill(0,255,0);
     rect(x2,lowery, 50, HEIGHT - lowery );
     x2 -= 5;
  
    }
   public void mousePressed() {
	birdYVelocity = 80;
	y -= birdYVelocity;
	
} 
   boolean intersectsPipes() { 
       if (y < upperPipeHeight && x > x2 && x < (x2+50)){
          return true; }
      else if (y>lowery && x > x2 && x < (x2+50)) {
          return true; }
      else { return false; }
}
   
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
