
public class Monster extends Character {
  public Monster(int posX, int posY, String costume, int hp, int dp, int sp) {
    super(posX, posY, costume, hp, dp, sp);
  }

  private final String IMP = "./assets/doom/imp.png";
  private final String ZOMBIE = "./assets/doom/zombie.png";
  private Board myArray = new Board();

  Monster() {
    int random = (int) (Math.random() * 2);
    if (random == 0) {
      this.costume = ZOMBIE;
    } else {
      this.costume = IMP;
    }

    int hpVol2 = 0;
    for (int i = 0; i < 2; i++) {
      hpVol2 += dice();
    }
    this.hp = hpVol2 + 20;

    for (int i = 0; i < 3; i++) {
      posX = (int) (Math.random() * 10);
      posY = (int) (Math.random() * 10);
      while (!myArray.IsWall(posX, posY)) {
        posX = (int) (Math.random() * 10);
        posY = (int) (Math.random() * 10);
      }
    }
  }
}
