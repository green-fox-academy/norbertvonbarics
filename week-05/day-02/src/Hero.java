import java.awt.*;

class Hero extends Character {

  final String HERODOWN = "./assets/hero-down.png";
  final String HEROUP = "./assets/hero-up.png";
  final String HERORIGHT = "./assets/hero-right.png";
  final String HEROLEFT = "./assets/hero-left.png";

  void paintHero(Graphics graphics, int angle, int testBoxX, int testBoxY) {
    if (angle == 0) {
      PositionedImage startHero = new PositionedImage(HERODOWN, testBoxX, testBoxY);
      startHero.draw(graphics);
    }

    if (angle == 1) {
      PositionedImage hero = new PositionedImage(HERODOWN, testBoxX, testBoxY);
      hero.draw(graphics);
    } else if (angle == 2) {
      PositionedImage hero = new PositionedImage(HEROUP, testBoxX, testBoxY);
      hero.draw(graphics);
    } else if (angle == 3) {
      PositionedImage hero = new PositionedImage(HERORIGHT, testBoxX, testBoxY);
      hero.draw(graphics);
    } else if (angle == 4) {
      PositionedImage hero = new PositionedImage(HEROLEFT, testBoxX, testBoxY);
      hero.draw(graphics);
    }
  }
}
