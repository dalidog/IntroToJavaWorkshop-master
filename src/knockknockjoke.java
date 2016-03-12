import java.util.Random;
import javax.swing.JOptionPane;


public class knockknockjoke {
	public static void main(String[] args) {
		
		int poo=new Random ().nextInt(3);
		if (poo==1) {
			JOptionPane.showInputDialog(null,"Knock Knock (Type in 'Who's There?')");
			JOptionPane.showInputDialog(null, "Cows go (Say 'Cows Go Who')");
			JOptionPane.showMessageDialog(null, "No, stupid, cows go moo!");
		}
		
		else if (poo==2) {
			JOptionPane.showInputDialog(null,"Knock Knock (Type in 'Who's There?')");
			JOptionPane.showInputDialog(null, " (Lettuce (Say Lettuce ' Who')");
			JOptionPane.showMessageDialog(null, "Lettuce in it’s cold out here!");
			
		}
	
		else if (poo==3) {
			
		
		JOptionPane.showInputDialog(null,"Knock Knock (Type in 'Who's There?')");
		JOptionPane.showInputDialog(null, " (Canoe (Say 'Canoe Who')");
		JOptionPane.showMessageDialog(null, "Canoe help me with my programming? I'm really struggling.");
		
		
		}
	}
	

}
