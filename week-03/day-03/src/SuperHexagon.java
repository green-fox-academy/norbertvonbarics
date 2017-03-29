import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/super-hexagon/r6.gif]
    sHexagobon(graphics);
  }

  public static void sHexagobon(Graphics hex) {
    int x = 100;
    int y = 100;

    int npoints = 6;
    for (int i = 0; i < 6 ; i++) {
      int xpoints[] = {x, x + 20, x + 30, x + 20, x, x - 10, x};
      int ypoints[] = {y, y, y + 20, y + 40, y + 40, y + 20, y};
      hex.drawPolygon(xpoints, ypoints, npoints);
      y += 40;

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