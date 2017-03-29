
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.


    int posY = 0;
    for (int i = 0; i < 700; i++) {
      int posX;
      if ((i % 2 == 0) || (i == 0)) {
        posX = 20;
      } else {
        posX = 0;
      }
      for (int j = 0; j < 2000; j += 50) {
        squares(graphics, posX, posY);
        posX += 40;
      }
      posY += 20;
    }
  }


  public static void squares(Graphics square, int number1, int number2) {
    square.setColor(Color.black);
    square.fillRect(number1, number2, 20, 20);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}