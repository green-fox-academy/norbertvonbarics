import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

  public static void mainDraw(Graphics graphics) {

    int steps = 0;
    int size = 10;
    for (int i = 0; i < 11; i++) {
      squares(graphics, steps, size);
      steps += size;
      size *= 2;
    }
  }

  public static void squares(Graphics square, int position, int size) {
    Color myColor = new Color(177,70,244);
    square.setColor(myColor);
    square.fillRect(position, position, size, size);
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