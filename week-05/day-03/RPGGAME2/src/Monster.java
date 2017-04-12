
public class Monster extends Character {
  int random;

  public Monster(int posX, int posY, String costume) {
    super(posX, posY);
  }

  Board myArray = new Board();
  int[] posXArray = new int[]{0, 0, 0};
  int[] posYArray = new int[]{0, 0, 0};

  public Monster() {
    this.costume = "./assets/doom/zombie.png";
    for (int i = 0; i < 3; i++) {

      posX = (int) (Math.random() * 10);
      posY = (int) (Math.random() * 10);
      while (!myArray.ifThereIsWall(posX, posY)) {
        posX = (int) (Math.random() * 10);
        posY = (int) (Math.random() * 10);
      }
      posXArray[i] = posX;
      posYArray[i] = posY;
    }
  }
}
