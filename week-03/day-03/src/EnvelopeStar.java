import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {
    lines(graphics);
  }

  public static void lines(Graphics line) {
    for (int i = 0; i < 150; i += 10) {
      line.setColor(Color.green);
      line.drawLine(150, i, 150 + i, 150);
      line.setColor(Color.green);
      line.drawLine(300 -i,  150, 150, 150 + i);
      line.setColor(Color.green);
      line.drawLine(150, 300 -i, 150- i, 150);
      line.setColor(Color.green);
      line.drawLine(i, 150, 150, 150-i);
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