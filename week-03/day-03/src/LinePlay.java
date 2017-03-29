
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {
    lines(graphics);
  }

  public static void lines(Graphics line) {
    int beginPosX1 = 0;
    int beginposY1 = 0;
    int finalPosX1 = 20;
    int finalPosY1 = 300;

    int beginPosX2 = 0;
    int beginposY2 = 0;
    int finalPosX2 = 300;
    int finalPosY2 = 20;

    for (int i = 0; i < 15; i++) {
      line.setColor(Color.green);
      line.drawLine(beginPosX1, beginposY1, finalPosX1, finalPosY1);
      line.setColor(Color.magenta);
      line.drawLine(beginPosX2, beginposY2, finalPosX2, finalPosY2);
      beginposY1 += 20;
      finalPosX1 += 20;
      beginPosX2 += 20;
      finalPosY2 += 20;

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