import org.jointheleague.graphical.robot.Robot;

public class ColorSpiral {

	public static void main(String[] args) {
		Robot dalia = new Robot();
		dalia.penDown();
		dalia.setSpeed(10);

		for (int i = 0; i < 100; i++) {

			dalia.setRandomPenColor();
			dalia.move(5 * i);

			dalia.turn(360 / 15);

			dalia.setPenWidth(i);
		}
	}
}
