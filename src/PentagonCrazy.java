import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class PentagonCrazy {

	private void makePrettyThings() {
Robot dalia=new Robot();
dalia.penDown();
		// 8. Make the robot go at maximum speed (10)
dalia.setSpeed(10);
		// 9. Set the pen to a color that you like for the shape
dalia.setPenColor(Color.magenta);
int sides=(5);

int angles=(360/5);
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
for (int i = 0; i < 200; i++) {
	

			// 2. Move the robot 200 pixels
	dalia.move(i);

	

	dalia.turn(angles);
			// 11. Turn the robot one more degree
dalia.turn(1);
	}}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}


