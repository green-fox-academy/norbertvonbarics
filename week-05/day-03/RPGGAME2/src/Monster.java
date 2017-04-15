import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Monster extends Character {
  public Monster(int posX, int posY, String costume, int hp, int dp, int sp) {
    super(posX, posY, costume, hp, dp, sp);
  }

  private final String IMP = "./assets/doom/imp.png";
  private final String ZOMBIE = "./assets/doom/zombie.png";
  private Board myArray = new Board();

  Monster() {
    int random = (int) (Math.random() * 2);
    if (random == 0) {
      this.costume = ZOMBIE;
    } else {
      this.costume = IMP;
    }

    monsterHP();

    randomPos();

  /*  Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      public void run() {
        try {
          Robot johnny5 = new Robot();
          johnny5.keyPress(KeyEvent.VK_X);
          johnny5.keyRelease(KeyEvent.VK_X);
        } catch (AWTException ex) {
          System.out.println("JOHNNY 5 ERROR");
          ex.printStackTrace();
        }
      }
    }, 1000, 2000);
*/
  }
}
