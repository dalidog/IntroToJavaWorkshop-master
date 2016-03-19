
	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	public class AirlineRegistration {
		public static void main(String[] args) {
			
		
	String name=JOptionPane.showInputDialog("WHAT IS THE #1 NAME?");
	String names=JOptionPane.showInputDialog("WHAT IS THE #2 NAME?");
	String destination=JOptionPane.showInputDialog("WHERE DOES YOU WANTS TO RIDE TO IN THE FLYING AIRPLANE?");
	String birthday=JOptionPane.showInputDialog("WHAT IS THE DAY YOU IS BEING OUT OF THE MOMMY'S TUMMY?");
	String gender=JOptionPane.showInputDialog("IS YOU A GIRLS OR A BOYS?");
	JOptionPane.showMessageDialog(null, ""+names+"/"+name+"("+birthday+","+gender+") traveling to:"+destination);
		}
	}





