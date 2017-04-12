import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class GameEngine extends JComponent implements KeyListener {

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

  Hero newHero = new Hero();

  List<Tile> newTileList = new ArrayList<>();

  public GameEngine() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);

    for (int i = 0; i < multi.length; i++) {
      for (int j = 0; j < multi.length; j++) {
        Tile newTile = new Tile(i * 72, j * 72, multi[i][j] == 1);
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

    PositionedImage startHero = new PositionedImage(newHero.costume, newHero.posX*72, newHero.posY*72);
    startHero.draw(graphics);

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