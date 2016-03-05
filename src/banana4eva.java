
public class banana4eva {
	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++)

		{
			speak("banana");
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
