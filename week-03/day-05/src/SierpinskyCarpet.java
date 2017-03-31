
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics draw) {
    int posX = 150;
    int posY = 150;
    int width = 150;
    int height = 150;
    int counter = 16;
    drawRect(posX, posY, width, height, draw, counter);
  }

  public static void drawRect(int posX, int posY, int width, int height, Graphics draw, int counter) {
    draw.fillRect(posX, posY, width, height);
    if (counter > 0) {
      drawRect(posX - width / 3 * 2, posY - width / 3*2, width / 3, height / 3, draw, counter - 1);
      drawRect(posX + width / 3, posY - width / 3*2, width / 3, height / 3, draw, counter - 1);
      drawRect(posX + width / 3 * 4, posY - width / 3*2, width / 3, height / 3, draw, counter - 1);

      drawRect(posX - width / 3 * 2, posY + width / 3, width / 3, height / 3, draw, counter - 1);
      drawRect(posX + width / 3 * 4, posY + width / 3, width / 3, height / 3, draw, counter - 1);

      drawRect(posX - width / 3 * 2, posY + width / 3 * 4, width / 3, height / 3, draw, counter - 1);
      drawRect(posX + width / 3, posY + width / 3 * 4, width / 3, height / 3, draw, counter - 1);
      drawRect(posX + width / 3 * 4, posY + width / 3 * 4, width / 3, height / 3, draw, counter - 1);
    }
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