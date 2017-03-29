import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)
      triangles(graphics, 15);
  }

  public static void triangles(Graphics triangle, int numTriangles) {

    int x = 16;
    int y = 150;
    for (int i = 1; i < 15 * numTriangles + 1; i++) {
      x = 16 + i * 6;
      for (int j = 1; j < numTriangles + 1; j++) {
        int xpoints[] = {x, x - 6, x + 6};
        int ypoints[] = {y, y + 10, y + 10};
        int npoints = 3;
        triangle.drawPolygon(xpoints, ypoints, npoints);
        x += 12;

      }
      y -= 10;
      numTriangles--;
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
    jFrame.setBackground(Color.black);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}