import javax.swing.JOptionPane;

public class NASACountdown {
	public static void main(String[] args) {

// 2. ask the user when to start (JOptionPane.showInputDialog)
		speak("Where do you want to start the countdown, random person?");
		String answer=JOptionPane.showInputDialog(null,"Where do you want to start the countdown, random person?");
	
		// 3. convert the user's answer to an int (Integer.parseInt)
int answer2=Integer.parseInt(answer);	

// 4. countdown from user's starting point
		// 1. countdown from 10 to 0
for (int i = answer2; i >=0; i--) {
	speak(""+i);
}
speak("Blastoff!!!!!!!")	;	
// 5. when the counting is done, print "blastoff!"
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}

