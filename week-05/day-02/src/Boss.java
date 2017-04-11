import java.awt.*;

public class Boss extends Character {
  final String BOSS = "./assets/boss.png";

  public void paintBoss(Graphics graphics) {
    PositionedImage skeleton1 = new PositionedImage(BOSS, 360, 360);
    skeleton1.draw(graphics);
  }
}
