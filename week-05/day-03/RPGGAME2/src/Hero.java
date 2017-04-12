

public class Hero extends Character {
  int angle;

  public Hero(int posX, int posY) {
    super(posX, posY);
  }

  public Hero() {
    super();
  }

  public void heroMoveUp() {
    super.costume = "./assets/hero-up.png";
    if (posY >= 72) {
      posY -= 72;
    }
  }

  public void heroMoveDown() {
    super.costume = "./assets/hero-down.png";
    if (posY <= 576) {
      posY += 72;
    }
  }

  public void heroMoveRight() {
    super.costume = "./assets/hero-right.png";
    if (posX <= 576) {
      posX += 72;
    }
  }

  public void heroMoveLeft() {
    super.costume = "./assets/hero-left.png";
    if (posX >= 72) {
      posX -= 72;
    }
  }
}
