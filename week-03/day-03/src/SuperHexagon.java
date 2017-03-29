import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/super-hexagon/r6.gif]
    sHexagobon(graphics, 10);
  }

  public static void sHexagobon(Graphics hex, int size) {
    int x = 100;
    int y = 150;
    //for (int i = 1; i < 15 * size + 1; i++) {

        int xpoints[] = {x, x+20, x+30, x+20, x, x-10, x};
        int ypoints[] = {x, x, x+20, x+40, x+40, x+20, x};
        int npoints = 6;
        hex.drawPolygon(xpoints, ypoints, npoints);
   // }
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