
public class Boss extends Character {
  private Board myArray = new Board();

  private final String BOSS = "./assets/doom/mechademon.png";

  public Boss(int posX, int posY, String costume, int hp, int dp, int sp) {
    super(posX, posY, costume, hp, dp, sp);
  }

  Boss() {
    this.costume = BOSS;

    posX = (int) (Math.random() * 10);
    posY = (int) (Math.random() * 10);
    while (!myArray.IsWall(posX, posY)) {
      posX = (int) (Math.random() * 10);
      posY = (int) (Math.random() * 10);
    }
  }
}
