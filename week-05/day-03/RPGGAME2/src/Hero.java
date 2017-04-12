

public class Hero extends Character {
  Board myArray = new Board();

  public Hero(int posX, int posY) {
    super(posX, posY);
  }

  Hero() {
    super();
  }

  void heroMoveUp() {
    super.costume = "./assets/hero-up.png";
    if (posY >= 72) {
      posY -= 72;
    }

  }

  void heroMoveDown() {
    super.costume = "./assets/hero-down.png";
    //isThereIsAWall((posY + 72));
    if (isThereIsAWall(posY + 72) && posY <= 576) {
      posY += 72;
    }

  }

  void heroMoveRight() {
    super.costume = "./assets/hero-right.png";
    if (posX <= 576) {
      posX += 72;
    }
  }

  void heroMoveLeft() {
    super.costume = "./assets/hero-left.png";
    if (posX >= 72) {
      posX -= 72;
    }
  }

  private boolean isThereIsAWall(int pos) {
    for (int i = 0; i < myArray.array2d().length; i++) {
      for (int j = 0; j < myArray.array2d().length; j++) {
        return ((myArray.array2d()[i][j] == 1 && ((posX == i * 72) && (posY == j * 72))));
      }
    }
    return false;
  }
}
