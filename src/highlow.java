import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class highlow {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);
		String guess = JOptionPane.showInputDialog("Pick a # ");
		JOptionPane.showMessageDialog(null, random);
		// 11. do the following 10 times

		// 1. ask the user for a guess using a pop-up window, and savString guess = JOptionPane.showInputDialog("Pick a
		// # ");
		// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int gus = Integer.parseInt(guess);
		// 5. if the guess is correct
		if (gus == random) {
			JOptionPane.showMessageDialog(null, "YOU WON YOU IDIOT!");
		}
		if (gus > random) {
			JOptionPane.showMessageDialog(null, "LOWER!YOU LOSE YOU IDIOT");
		}
		if (gus < random) {
			JOptionPane.showMessageDialog(null, "HIGHER! YOU LOSE YOU IDIOT");
		}
	}
	// 6. win
	// 7. if the guess is high
	// 8. tell them it's too high
	// 9. if the guess is low
	// 10. tell them it's too low

	// 12. tell them they lose
}
