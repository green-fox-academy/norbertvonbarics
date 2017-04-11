import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int angle;
  int testBoxX;
  int testBoxY;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    int[][] multi = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 0, 1, 1, 1, 0},
            {1, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
            {1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    int posX = 0;
    int posY = 0;

    for (int i = 0; i < multi.length; i++) {
      for (int j = 0; j < multi.length; j++) {
        if (multi[i][j] == 1) {
          posX = i * 72;
          posY = j * 72;
          PositionedImage wall = new PositionedImage("./assets/wall.png", posX, posY);
          wall.draw(graphics);
        } else {
          posX = i * 72;
          posY = j * 72;
          PositionedImage image = new PositionedImage("./assets/floor.png", posX, posY);
          image.draw(graphics);
        }
      }
    }
    PositionedImage startHero = new PositionedImage("./assets/hero-down.png", testBoxX, testBoxY);
    startHero.draw(graphics);

    if (angle == 1) {
      PositionedImage hero = new PositionedImage("./assets/hero-down.png", testBoxX, testBoxY);
      hero.draw(graphics);
    } else if (angle == 2) {
      PositionedImage hero = new PositionedImage("./assets/hero-up.png", testBoxX, testBoxY);
      hero.draw(graphics);
    } else if (angle == 3) {
      PositionedImage hero = new PositionedImage("./assets/hero-right.png", testBoxX, testBoxY);
      hero.draw(graphics);
    } else if (angle == 4) {
      PositionedImage hero = new PositionedImage("./assets/hero-left.png", testBoxX, testBoxY);
      hero.draw(graphics);
    }
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (testBoxX >= 0 && testBoxX <= 648) {
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        testBoxY -= 72;
        angle = 2;
      } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        testBoxY += 72;
        angle = 1;
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        testBoxX += 72;
        angle = 3;
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        testBoxX -= 72;
        angle = 4;
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}