import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio_Player {

	public static void main(String[] args)
			throws UnsupportedAudioFileException, IOException {

		Scanner scanner = new Scanner(System.in);
		File file = new File("ImperialMarch60.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = null;
		try {
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			clip.open(audioStream);
			clip.start();
		} catch (LineUnavailableException e) {

			e.printStackTrace();
		}
		String response = scanner.next();

		// String response = "";
		//
		// while (response.equals("Y")) {
		// System.out.println("P = Play, S = Stop R = Reset , Q = Quit");
		// System.out.println("Enter your choice: ");
		// String response11 = scanner.next();
		// response11 = response11.toUpperCase();
		// switch (response11) {
		// case ("P"):
		// clip.start();
		// break;
		// default:
		// System.out.println("In valid ");
		// }
		// }

		// above will not work for 1.6 JRE
		clip.close();
	}

}
