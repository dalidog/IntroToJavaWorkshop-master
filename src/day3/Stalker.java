package day3;

import javax.swing.JOptionPane;

public class Stalker {public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"You will now be having a short quiz on your personal info.");
	String Answer=JOptionPane.showInputDialog("Question1. What is your full name?");
	String thing=JOptionPane.showInputDialog("Question2. What is your phone number?");
	String blahblah=JOptionPane.showInputDialog("Question3. What is your address?");
	JOptionPane.showMessageDialog(null,"Ha Ha! I now have your full name, phone  number, and address. You shouldn't be so stupid next time, giving all your personal info to a stalker computer.");

}

}
