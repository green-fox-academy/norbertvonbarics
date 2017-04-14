

public class Hero extends Character {
  private Board myArray = new Board();
  private int hpVol3 = 0;

  public Hero(int posX, int posY, int hp, int dp, int sp) {
    super(posX, posY);

    this.hp = hp;
    this.dp = dp;
    this.sp = sp;
  }


  Hero() {
    for (int i = 0; i < 3; i++) {
      hpVol3 += dice();
    }
    this.hp = hpVol3 + 20;
  }

  void heroMoveUp() {
    super.costume = "./assets/doom/doom-up.png";
    if ((myArray.IsWall(posX, posY - 1)) && (posY > 0)) {
      posY -= 1;
    }
  }

  void heroMoveDown() {
    super.costume = "./assets/doom/doom-down.png";
    if ((myArray.IsWall(posX, posY + 1)) && (posY < 9)) {
      posY += 1;
    }

  }

  void heroMoveRight() {
    super.costume = "./assets/doom/doom-right.png";
    if ((myArray.IsWall(posX + 1, posY)) && (posX < 9)) {
      posX += 1;
    }
  }

  void heroMoveLeft() {
    super.costume = "./assets/doom/doom-left.png";
    if ((myArray.IsWall(posX - 1, posY)) && (posX > 0)) {
      posX -= 1;
    }
  }
}
