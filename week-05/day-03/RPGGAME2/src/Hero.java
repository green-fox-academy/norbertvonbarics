

public class Hero extends Character {
  private Board myArray = new Board();

  private final String DOOMUP = "./assets/doom/doom-up.png";
  private final String DOOMDOWN ="./assets/doom/doom-down.png";
  private final String DOOMRIGHT ="./assets/doom/doom-right.png";
  private final String DOOMLEFT = "./assets/doom/doom-left.png";

  public Hero(int posX, int posY, String costume, int hp, int dp, int sp) {
    super(posX, posY, costume, hp, dp, sp);
  }


  Hero() {
    int hpVol3 = 0;
    for (int i = 0; i < 3; i++) {
      hpVol3 += dice();
    }
    this.hp = hpVol3 + 20;
  }

  void heroMoveUp() {
    super.costume = DOOMUP;
    if ((myArray.IsWall(posX, posY - 1)) && (posY > 0)) {
      posY -= 1;
    }
  }

  void heroMoveDown() {
    super.costume = DOOMDOWN;
    if ((myArray.IsWall(posX, posY + 1)) && (posY < 9)) {
      posY += 1;
    }

  }

  void heroMoveRight() {
    super.costume = DOOMRIGHT;
    if ((myArray.IsWall(posX + 1, posY)) && (posX < 9)) {
      posX += 1;
    }
  }

  void heroMoveLeft() {
    super.costume = DOOMLEFT;
    if ((myArray.IsWall(posX - 1, posY)) && (posX > 0)) {
      posX -= 1;
    }
  }
}
