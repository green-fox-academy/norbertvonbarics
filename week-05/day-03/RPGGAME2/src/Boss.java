
public class Boss extends Character {
  public Boss(int posX, int posY, String costume) {
    super(posX, posY);
  }

  Board myArray = new Board();
  int random;

  public Boss() {
    this.costume = "./assets/doom/mechademon.png";

    posX = (int) (Math.random() * 10);
    posY = (int) (Math.random() * 10);
    while (!myArray.ifThereIsWall(posX, posY)){
      posX = (int) (Math.random() * 10);
      posY = (int) (Math.random() * 10);
    }
  }
}
