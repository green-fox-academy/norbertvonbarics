import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class GameEngine extends JComponent implements KeyListener {
  Hero newHero = new Hero();
  Monster newMonster = new Monster();
  Boss newBoss = new Boss();
  Board myArray = new Board();

  List<Tile> newTileList = new ArrayList<>();

  public GameEngine() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);

    for (int i = 0; i < myArray.array2d().length; i++) {
      for (int j = 0; j < myArray.array2d().length; j++) {
        Tile newTile = new Tile(i * 72, j * 72, myArray.array2d()[i][j] == 1);
        newTileList.add(newTile);
      }
    }
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

    PositionedImage skeleton = new PositionedImage(newMonster.costume, newMonster.posXArray[0] * 72, newMonster.posYArray[0] * 72);
    skeleton.draw(graphics);
    PositionedImage skeleton2 = new PositionedImage(newMonster.costume, newMonster.posXArray[1] * 72, newMonster.posYArray[1] * 72);
    skeleton2.draw(graphics);
    PositionedImage skeleton3 = new PositionedImage(newMonster.costume, newMonster.posXArray[2] * 72, newMonster.posYArray[2] * 72);
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      newHero.heroMoveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      newHero.heroMoveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      newHero.heroMoveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      newHero.heroMoveRight();
    }
    repaint();
  }
}