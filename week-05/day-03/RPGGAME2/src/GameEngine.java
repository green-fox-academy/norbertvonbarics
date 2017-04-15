import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;
import java.util.Timer;

public class GameEngine extends JComponent implements KeyListener {
  private Hero newHero = new Hero();
  private Monster newMonster1 = new Monster();
  private Monster newMonster2 = new Monster();
  private Monster newMonster3 = new Monster();
  private Boss newBoss = new Boss();
  private Board myArray = new Board();

  private int counter = 1;
  int level = 1;

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
    PositionedImage skeleton2 = new PositionedImage(newMonster2.costume, newMonster2.posX * 72, newMonster2.posY * 72);
    PositionedImage skeleton3 = new PositionedImage(newMonster3.costume, newMonster3.posX * 72, newMonster3.posY * 72);
    PositionedImage boss = new PositionedImage(newBoss.costume, newBoss.posX * 72, newBoss.posY * 72);
    String printLevel = "Level: " + Integer.toString(level);
    String printBossHp = "Boss Hp: " + Integer.toString(newBoss.hp);
    String printMon1Hp = "Monster 1 Hp: " + Integer.toString(newMonster1.hp);
    String printMon2Hp = "Monster 2 Hp: " + Integer.toString(newMonster2.hp);
    String printMon3Hp = "Monster 3 Hp: " + Integer.toString(newMonster3.hp);

    graphics.setFont(new Font("TimesRoman", Font.PLAIN, 20));

    if (level < 11) {
      graphics.drawString(printLevel, 750, 50);
      graphics.drawString(printBossHp, 750, 70);
      graphics.drawString(printMon1Hp, 750, 90);
      graphics.drawString(printMon2Hp, 750, 110);
      graphics.drawString(printMon3Hp, 750, 130);

      skeleton.draw(graphics);
      skeleton2.draw(graphics);
      skeleton3.draw(graphics);
      boss.draw(graphics);
      if (newMonster1.hp < 1 && newMonster2.hp < 1 && newMonster3.hp < 1 && newBoss.hp < 1) {
        level++;

        newMonster1.randomPos();
        newMonster2.randomPos();
        newMonster3.randomPos();
        newBoss.randomPos();

        newBoss.monsterHP(level);
        newMonster1.monsterHP(level);
        newMonster2.monsterHP(level);
        newMonster3.monsterHP(level);

        newBoss.monsterDP(level);
        newMonster1.monsterDP(level);
        newMonster2.monsterDP(level);
        newMonster3.monsterDP(level);
      }
    } else {
      graphics.setFont(new Font("TimesRoman", Font.PLAIN, 120));
      graphics.drawString("YOU WIN!", 750, 150);
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (counter == 0) {
      newBoss.characterMove();
      newMonster1.characterMove();
      newMonster2.characterMove();
      newMonster3.characterMove();
      counter++;
    } else {
      counter--;
    }

/*
    if (e.getKeyCode() == KeyEvent.VK_X) {
      newBoss.characterMove();
      newMonster1.characterMove();
      newMonster2.characterMove();
      newMonster3.characterMove();
      System.out.println(counter2);
    }
*/
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      newHero.heroMoveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      newHero.heroMoveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      newHero.heroMoveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      newHero.heroMoveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      if (newBoss.posX == newHero.posX && newBoss.posY == newHero.posY) {
        newBoss.attackMonsters();
      }
      if (newMonster1.posX == newHero.posX && newMonster1.posY == newHero.posY) {
        newMonster1.attackMonsters();
      }
      if (newMonster2.posX == newHero.posX && newMonster2.posY == newHero.posY) {
        newMonster2.attackMonsters();
      }
      if (newMonster3.posX == newHero.posX && newMonster3.posY == newHero.posY) {
        newMonster3.attackMonsters();
      }
    }
    repaint();
  }
}