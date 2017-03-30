import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReproduceThis1 {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.fillRect(0, 0, 486, 486);
    graphics.setColor(Color.black);

    recurse(graphics, 0, 0, 486, 5);
  }

  public static void recurse(Graphics lines, int posX, int posY, int size, int counter) {
    lines.drawRect(posX, posY, size, size);
    if (counter > 0) {
      recurse(lines, posX + size / 3, posY, size / 3, counter-1);
      recurse(lines, posX, posY + size / 3, size / 3, counter-1);
      recurse(lines, posX + size / 3, posY + size / 3 * 2, size / 3, counter-1);
      recurse(lines, posX + size / 3 * 2, posY + size / 3, size / 3, counter-1);
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


// create a 300x300 canvas.