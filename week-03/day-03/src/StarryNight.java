import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

  public static void mainDraw(Graphics graphics) {
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)
    int randomNumberOfStars = (int) Math.ceil(Math.random() * 1000);
    Starry(graphics, randomNumberOfStars );
  }

  public static void Starry(Graphics dots, int numberOfStars) {
    dots.setColor(Color.black);
    dots.fillRect(0,0,300,300);
    
    for (int i = 0; i < numberOfStars; i++) {
      int randomColor = 115 + (int) Math.ceil(Math.random() * 115);
      Color myColor = new Color(randomColor, randomColor, randomColor);
      dots.setColor(myColor);
      int randomNumberOne = (int) Math.ceil(Math.random() * 300);
      int randomNumberTwo = (int) Math.ceil(Math.random() * 300);

      dots.drawLine(randomNumberOne, randomNumberTwo, randomNumberOne, randomNumberTwo);
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