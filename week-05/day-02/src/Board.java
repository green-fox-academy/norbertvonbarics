import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  final String FLOOR = "./assets/floor.png";
  final String WALL = "./assets/wall.png";

  int angle = 0;
  int testBoxX;
  int testBoxY;
  BoardArray myArray = new BoardArray();

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

    int posX = 0;
    int posY = 0;

    for (int i = 0; i < myArray.array2d().length; i++) {
      for (int j = 0; j < myArray.array2d().length; j++) {
        if (myArray.array2d()[i][j] == 1) {
          posX = i * 72;
          posY = j * 72;
          PositionedImage wall = new PositionedImage(WALL, posX, posY);
          wall.draw(graphics);
        } else {
          posX = i * 72;
          posY = j * 72;
          PositionedImage image = new PositionedImage(FLOOR, posX, posY);
          image.draw(graphics);
        }
      }
    }

    Hero hero = new Hero();
    hero.paintHero(graphics, angle, testBoxX, testBoxY);

    Monster monster = new Monster();
    monster.paintSkeleton(graphics);

    Boss boss = new Boss();
    boss.paintBoss(graphics);
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

    int currentX = testBoxX;
    int currentY = testBoxY;

    if (testBoxX >= 0 && testBoxX <= 648) {
      Sounds testPlay = new Sounds();
      if ((e.getKeyCode() == KeyEvent.VK_UP) && (testBoxY >= 72)) {
        testBoxY -= 72;
        angle = 2;
        testPlay.playmp3();
      } else if ((e.getKeyCode() == KeyEvent.VK_DOWN) && (testBoxY <= 576)) {
        testBoxY += 72;
        angle = 1;
        testPlay.playmp3();
      } else if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (testBoxX <= 576)) {
        testBoxX += 72;
        angle = 3;
        testPlay.playmp3();
      } else if ((e.getKeyCode() == KeyEvent.VK_LEFT) && (testBoxX >= 72)) {
        testBoxX -= 72;
        angle = 4;
        testPlay.playmp3();
      }

      for (int i = 0; i < myArray.array2d().length; i++) {
        for (int j = 0; j < myArray.array2d().length; j++) {
          if ((myArray.array2d()[i][j] == 1 && ((testBoxX == i * 72) && (testBoxY == j * 72)))) {
            testBoxX = currentX;
            testBoxY = currentY;
          }
        }
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}