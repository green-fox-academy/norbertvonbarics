import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    int random1 = 0;
    int random2 = 0;

    for (int i = 0; i < 4; i++){
      random1 = (int) Math.ceil(Math.random() * 200);
      random2 = (int) Math.ceil(Math.random()* 100);
    }

    graphics.setColor(Color.red);
    graphics.fillRect(0,0, random1, random2);
    graphics.fillRect(200,0, random1, random2);
    graphics.fillRect(200,200, random1, random2);
    graphics.fillRect(0,200, random1, random2);

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