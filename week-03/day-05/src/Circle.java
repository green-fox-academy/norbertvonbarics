import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {
  public static void mainDraw(Graphics draw) {
    int posX = 50;
    int posY = 50;
    int width = 300;
    int height = 300;
    int counter = 3;
    drawCircle(posX, posY, width, height, draw, counter);
  }

  public static void drawCircle(int posX, int posY, int width, int height, Graphics draw, int counter) {
    draw.drawOval(posX, posY, width, height);
    if (counter > 0) {
      drawCircle(posX + width / 4, posY, width / 2, height / 2, draw, counter - 1);
      drawCircle(posX + width/16, posY + width/12*5, width / 2, height / 2, draw, counter - 1);
      drawCircle(posX + width/4*6, posY + width/12*5, width / 2, height / 2, draw, counter - 1);
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