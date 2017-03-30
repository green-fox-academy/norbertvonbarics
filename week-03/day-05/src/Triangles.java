import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics triangles) {
    int posX = 200;
    int posY = 400;
    int width = 200;
    int height = 300;
    int counter = 5;
    triangles(posX, posY, width, height, triangles, counter);
  }

  public static void triangles(int posX, int posY, int width, int height, Graphics triang, int counter) {
    int x[] = {posX, posX - width / 2, posX + width / 2};
    int y[] = {posY, posY - height, posY - height};
    triang.drawPolygon(x, y, 3);
    if (counter == 0) {
      return;
    } else {
      triangles(posX, posY, width / 2, height / 2, triang, counter - 1);
      triangles(posX - width / 4, posY - height / 2, width / 2, height / 2, triang, counter - 1);
      triangles(posX + width / 4, posY - height / 2, width / 2, height / 2, triang, counter - 1);
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