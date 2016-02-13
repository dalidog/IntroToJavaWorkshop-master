// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class tortoisecolorchooser {
	public static void main(String[] args) {
		Tortoise dalia=new Tortoise();
		//3. ask the user what color they would like the tortoise to draw
		String answer=JOptionPane.showInputDialog("What color would you like your tortoise to draw? "
				+ "P.S. It has to be magenta or pink!!!");
		//4. use an if/else statement to set the pen color that the user requested

		if (answer.equals("magenta")) {
			dalia.setPenColor(Color.magenta);	
		}
		else if (answer.equals("pink")){
			dalia.setPenColor(Color.PINK);
		}


//5. if the user doesn’t enter anything, choose a random color
		else{
			dalia.setPenColor(Colors.getRandomColor());
		}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
	
		dalia.show();
		dalia.penDown();
		dalia.setPenWidth(10);
		for (int i = 0; i < 4; i++) {
			dalia.move(100);
			dalia.turn(90);
	
		}
	}
}

