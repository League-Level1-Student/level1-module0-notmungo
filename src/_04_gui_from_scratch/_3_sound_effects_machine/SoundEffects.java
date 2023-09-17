package _04_gui_from_scratch._3_sound_effects_machine;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffects {
	public void showButton() {
	  JFrame frame = new JFrame();
      JButton button = new JButton();
      JLabel label = new JLabel();
      JPanel panel = new JPanel();
      frame.add(panel);
      JButton button2 = new JButton();
      
}
private void playSound(String soundFile) {
	String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}
}
