import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    int size = 20;
    int beginSize = 300;
    for (int i = beginSize; i > size; i -= 10) {
      int red = (int) Math.ceil(Math.random() * 255);
      int green = (int) Math.ceil(Math.random() * 255);
      int blue = (int) Math.ceil(Math.random() * 255);
      Color myColor = new Color(red, green, blue);
      drawSquare(graphics, beginSize, myColor);
      beginSize -= 10;
    }
  }

  public static void drawSquare(Graphics square, int size, Color color) {
    int centered = (150 - (size / 2));
    square.setColor(color);
    square.fillRect(centered, centered, size, size);
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