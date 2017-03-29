
import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    for (int i = 0; i < 3; i++) {
      int random1 = (int) Math.ceil(Math.random() * 150);
      int random2 = (int) Math.ceil(Math.random() * 150);
      lines(graphics, random1, random2);

    }
  }

  public static void lines(Graphics line, int X, int Y) {
    line.setColor(Color.blue);
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