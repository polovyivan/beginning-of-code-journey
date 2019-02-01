package ivan.polovyi.WebBarcodeAppSubstitute.model.sound;

import java.awt.Toolkit;
import java.io.FileInputStream;

import javazoom.jl.player.Player;



public class SoundPlayer {

	public static void playSound(String soundPath) {

		try {
			Toolkit.getDefaultToolkit().beep();
			FileInputStream fis = new FileInputStream(soundPath);
			Player playMP3 = new Player(fis);

			playMP3.play();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}