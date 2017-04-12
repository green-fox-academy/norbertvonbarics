import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Sounds {
  public void playmp3() {
    System.out.println("Please press play!");
    Scanner myScanner = new Scanner(System.in);
    String userControl = myScanner.nextLine();

    if (userControl.toLowerCase().equals("play")) {
      String songName = "Win sound.mp3";
      String pathToMp3 = "./assets" + "/" + songName;
      BasicPlayer myPlayer = new BasicPlayer();
      BasicController playerController = (BasicController) myPlayer;
      File file = new File(pathToMp3);
      try {
        playerController.open(file);
        playerController.play();

      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    System.out.println("The song is over!");
  }
}
