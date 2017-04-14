
public class Boss extends Character {
  private Board myArray = new Board();

  public Boss(int posX, int posY) {
    super(posX, posY);
  }

  Boss() {
    this.costume = "./assets/doom/mechademon.png";

    posX = (int) (Math.random() * 10);
    posY = (int) (Math.random() * 10);
    while (!myArray.IsWall(posX, posY)) {
      posX = (int) (Math.random() * 10);
      posY = (int) (Math.random() * 10);
    }
  }
}
