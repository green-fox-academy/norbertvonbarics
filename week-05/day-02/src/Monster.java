
import java.awt.*;

public class Monster extends Character {

  int[] posX = new int[]{0, 0, 0};
  int[] posY = new int[]{0, 0, 0};
  public void paintSkeleton(Graphics graphics) {

    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    BoardArray myArray = new BoardArray();

    int lower = 0;
    int upper = 648;
    int step = 72;

    for (int k = 0; k < 3; k++) {
      int rand = (int) (Math.random() * (upper - lower + 1));
      int result = rand - rand % step + lower;
      int rand2 = (int) (Math.random() * (upper - lower + 1));
      int result2 = rand2 - rand2 % step + lower;

      posX[k] = (result);
      posY[k] = (result2);

      for (int i = 0; i < myArray.array2d().length; i++) {
        for (int j = 0; j < myArray.array2d().length; j++) {
          if (myArray.array2d()[posX[k]/72][posY[k]/72] != 1)  {
            PositionedImage skeleton1 = new PositionedImage("./assets/skeleton.png", posX[k], posY[k]);
            skeleton1.draw(graphics);
          }
        }
      }
    }
  }
}

