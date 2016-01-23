import org.jointheleague.graphical.robot.Robot;

public class robotsquare {
	public static void main(String[] args) throws Exception {
		Robot dalia = new Robot();
		dalia.penDown();
		dalia.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			dalia.move(200);
			dalia.turn(90);
		}
	}
}
