import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class code4Life {
	public static void main(String[] args) {
		
	
	// Ask the user how many hours they spent coding this week.
	 String answer=JOptionPane.showInputDialog("How many hours does you spending coding and having your nose stuck to the computer?");
	int answer2=Integer.parseInt(answer);
	 //1. If it's 3 or more, tell them they're a Code Ninja.
	if(answer2>3){
		
	}
	 
	 //2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	
	 // 3. If it's more than 5, play the Batman theme song.
	 

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}}

}
