
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int random = new Random().nextInt(4);

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"

		// 3. Print out this variable
		JOptionPane.showMessageDialog(null, random);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask me a question.");
		// 5. If the random number is 0
if(random==0){
	JOptionPane.showMessageDialog(null,"Yes");

}
		// -- tell the user "Yes"

		// 6. If the random number is 1
else if(random==1){
	JOptionPane.showMessageDialog(null,"No");
}
		// -- tell the user "No"

		// 7. If the random number is 2
else if(random==2){
	JOptionPane.showMessageDialog(null,"Maybe you should ask Google?");
}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
else if(random==3){
	JOptionPane.showMessageDialog(null,"Very Possible");
}
		// -- write your own answer

	}
}