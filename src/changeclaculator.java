
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class changeclaculator {

	public static void main(String[] args) {
String nickles=JOptionPane.showInputDialog("How many nickles do you have?");
int realnickles=Integer.parseInt(nickles);
String dimes=JOptionPane.showInputDialog("How many dimes do you have?");
int realdimes=Integer.parseInt(dimes);
String quarters=JOptionPane.showInputDialog("How many quarters do you have?");
int realquarters=Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double money=(realnickles * .05) + (realdimes * .10) + (realquarters * .25);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have "+money+".");
	}
}


