package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing  {
    public void showButton() {
    	 JFrame frame = new JFrame();
    	 frame.setVisible(true);
    	 JButton button = new JButton();
    	 frame.add(button);
    	 frame.pack();
    	 button.addActionListener(this);
       
        
   }
}


