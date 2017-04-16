import org.junit.Test;

import static org.junit.Assert.*;


public class HeroTest {

  Hero hero = new Hero(8, 2, "costume", 2, 3, 4);
  @Test
  public void heroMoveUpTest() {
    hero.heroMoveUp();
    assertEquals(1, hero.posY);
  }

  @Test
  public  void heroMoveDownTest() {
    hero.heroMoveDown();
    assertEquals(2, hero.posY);
  }

  @Test
  public void heroMoveRightTest() {
    hero.heroMoveRight();
    assertEquals(9, hero.posX);
  }

  @Test
  public void heroMoveLeftTest() {
    hero.heroMoveLeft();
    assertEquals(7, hero.posX);
  }
}