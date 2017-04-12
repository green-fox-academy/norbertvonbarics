

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
    if (ifThereIsWall(posX, posY - 1)&& posY >= 1){
      posY -= 1;
    }

  }

  void heroMoveDown() {
    super.costume = "./assets/hero-down.png";
    //isThereIsAWall((posY + 72));
    if (ifThereIsWall(posX, posY  + 1) && posY <= 8) {
      posY += 1;
    }

  }

  void heroMoveRight() {
    super.costume = "./assets/hero-right.png";
    if (ifThereIsWall(posX + 1, posY) && posX <= 8) {
      posX += 1;
    }
  }

  void heroMoveLeft() {
    super.costume = "./assets/hero-left.png";
    if (ifThereIsWall(posX - 1, posY) && posX >= 1) {
      posX -= 1;
    }
  }

  private boolean ifThereIsWall(int posX, int posY) {
    return (myArray.array2d()[posX][posY] != 1);
  }
}
