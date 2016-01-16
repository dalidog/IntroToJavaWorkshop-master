
import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			
		String sentence=JOptionPane.showInputDialog("Type in a sentence.");
		speak(sentence);
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

// Copyright Wintriss Technical Schools 2014