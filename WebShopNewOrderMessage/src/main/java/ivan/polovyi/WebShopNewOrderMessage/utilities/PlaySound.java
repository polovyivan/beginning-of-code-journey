package ivan.polovyi.WebShopNewOrderMessage.utilities;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class PlaySound {

	public static void playSound(String sound_path) {

		try {

			FileInputStream fis = new FileInputStream(sound_path);
			Player playMP3 = new Player(fis);

			playMP3.play();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
