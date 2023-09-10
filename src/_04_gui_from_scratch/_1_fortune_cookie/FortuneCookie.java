package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener  {
    public void showButton() {
    	 JFrame frame = new JFrame();
    	 frame.setVisible(true);
    	 JButton button = new JButton();
    	 frame.add(button);
    	 frame.pack();
    	 button.addActionListener(this);
    	 
    	 int rand = new Random().nextInt(5);
    	 if(rand == 1) {
    		 JOptionPane.showMessageDialog(frame, "You will have an amazing future.");
    	 }
    	 if(rand == 2) {
    		 JOptionPane.showMessageDialog(frame, "You will become a successful individual");
    	 }
    	 if(rand == 3) {
    		 JOptionPane.showMessageDialog(frame, "Today is a very good day for you");
    	 }
    	 if(rand == 4) {
    		 JOptionPane.showMessageDialog(frame, "You will win the lottery in the next 5 years");
    	 }
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


