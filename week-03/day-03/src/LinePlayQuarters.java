

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {
    lines(graphics);
  }

  public static void lines(Graphics line) {
    for (int i = 0; i < 300; i += 20) {
      line.setColor(Color.green);
      line.drawLine(0, i, 20 + i, 300);
      line.setColor(Color.green);
      line.drawLine(300, 300 - i, 280 - i, 0);
      line.setColor(Color.green);
      line.drawLine(300 - i, 0, 0, 20 + i);
      line.setColor(Color.green);
      line.drawLine(i, 300, 300, 280 - i);
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