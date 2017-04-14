
public class Monster extends Character {
  public Monster(int posX, int posY, String costume) {
    super(posX, posY);
  }

  private Board myArray = new Board();

  Monster() {
    int random = (int) (Math.random() *2);
    if (random == 0) {
      this.costume = "./assets/doom/zombie.png";
    } else {
      this.costume = "./assets/doom/imp.png";
    }
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
