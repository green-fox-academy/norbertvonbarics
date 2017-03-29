
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoesToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int posX = 0;
    int posY = 0;
    for (int i = 0; i < 16; i++) {
      lines(graphics, posX, 0);
      lines(graphics, 300, posY);
      lines(graphics, posX, 300);
      lines(graphics, 0, posY);
      posX += 20;
      posY += 20;
    }
      /*
      if ((posX < 300) && (posY == 0)) {
        posX += 20;
      } else if ((posX == 300) && (posY < 300)) {
        posY +=20;
      } else if ((posX > 0) && (posY == 300)) {
        posX -= 20;
      }*/

  }

  public static void lines(Graphics line, int X, int Y) {
    line.setColor(Color.black);
    line.drawLine(X, Y, 150, 150);
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