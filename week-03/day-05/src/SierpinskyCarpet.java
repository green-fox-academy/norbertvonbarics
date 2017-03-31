
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics draw) {
    int posX = 200;
    int posY = 200;
    int size = 200;
    int counter = 6;
    drawRect(posX, posY, size, size, draw, counter);
  }

  public static void drawRect(int posX, int posY, int size,int size1, Graphics draw, int counter) {
    draw.setColor(Color.magenta);
    draw.fillRect(posX, posY, size, size);

    if (counter > 0) {
      draw.fillRect(posX, posY, size/3, size/3);
      drawRect(posX - size / 3 * 2, posY - size / 3*2, size / 3, size / 3, draw, counter - 1);
      drawRect(posX + size / 3, posY - size / 3*2, size / 3, size / 3, draw, counter - 1);
      drawRect(posX + size / 3 * 4, posY - size / 3*2, size / 3, size / 3, draw, counter - 1);

      drawRect(posX - size / 3 * 2, posY + size / 3, size / 3, size / 3, draw, counter - 1);
      drawRect(posX + size / 3 * 4, posY + size / 3, size / 3, size / 3, draw, counter - 1);

      drawRect(posX - size / 3 * 2, posY + size / 3 * 4, size / 3, size / 3, draw, counter - 1);
      drawRect(posX + size / 3, posY + size / 3 * 4, size / 3, size / 3, draw, counter - 1);
      drawRect(posX + size / 3 * 4, posY + size / 3 * 4, size / 3, size / 3, draw, counter - 1);
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