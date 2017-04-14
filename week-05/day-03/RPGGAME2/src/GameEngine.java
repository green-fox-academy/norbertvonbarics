import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class GameEngine extends JComponent implements KeyListener {
  private Hero newHero = new Hero();
  private Monster newMonster1 = new Monster();
  private Monster newMonster2 = new Monster();
  private Monster newMonster3 = new Monster();
  private Boss newBoss = new Boss();
  private Board myArray = new Board();

  private int counter = 1;

  private List<Tile> newTileList = new ArrayList<>();

  GameEngine() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);

    for (int i = 0; i < myArray.array2d().length; i++) {
      for (int j = 0; j < myArray.array2d().length; j++) {
        Tile newTile = new Tile(i * 72, j * 72, myArray.array2d()[i][j] == 1);
        newTileList.add(newTile);
      }
    }
    System.out.println(newHero.hp);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (int i = 0; i < newTileList.size(); i++) {
      PositionedImage wall = new PositionedImage(newTileList.get(i).costume, newTileList.get(i).posX, newTileList.get(i).posY);
      wall.draw(graphics);
    }

    PositionedImage startHero = new PositionedImage(newHero.costume, newHero.posX * 72, newHero.posY * 72);
    startHero.draw(graphics);

    PositionedImage skeleton = new PositionedImage(newMonster1.costume, newMonster1.posX * 72, newMonster1.posY * 72);
    skeleton.draw(graphics);
    PositionedImage skeleton2 = new PositionedImage(newMonster2.costume, newMonster2.posX * 72, newMonster2.posY * 72);
    skeleton2.draw(graphics);
    PositionedImage skeleton3 = new PositionedImage(newMonster3.costume, newMonster3.posX * 72, newMonster3.posY * 72);
    skeleton3.draw(graphics);
    PositionedImage boss = new PositionedImage(newBoss.costume, newBoss.posX * 72, newBoss.posY * 72);
    boss.draw(graphics);
  }


  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
      try {
        Robot johnny5 = new Robot();

        johnny5.keyPress(KeyEvent.VK_X);
        johnny5.keyRelease(KeyEvent.VK_X);
      } catch  (AWTException ex) {
        System.out.println("JOHNNY 5 ERROR");
        ex.printStackTrace();
      }
      if (e.getKeyCode() == KeyEvent.VK_X) {
        newBoss.characterMove();
        newMonster1.characterMove();
        newMonster2.characterMove();
        newMonster3.characterMove();
      }

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      newHero.heroMoveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      newHero.heroMoveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      newHero.heroMoveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      newHero.heroMoveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      //attack method
    }
    repaint();
  }
}