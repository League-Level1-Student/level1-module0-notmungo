package _04_gui_from_scratch._4_cuteness_tv;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Zzz implements ActionListener {
public void showButton() {
	System.out.println("Button Clicked");
	 JFrame frame = new JFrame();
	 frame.setVisible(true);
	 JButton button = new JButton();
	 frame.add(button);
	 frame.pack();
	 button.addActionListener(this);
	 JButton button2 = new JButton();
	 JButton button3 = new JButton();
	
		 
	 
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}
	

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
void playVideo(String videoID) {
	
}

}
