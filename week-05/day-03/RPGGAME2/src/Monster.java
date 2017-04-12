
public class Monster extends Character {
  public Monster(int posX, int posY, String costume) {
    super(posX, posY);
  }

  public Monster() {
    this.posX = randomNumber();
    this.posY = randomNumber();
    this.costume = "./assets/skeleton.png";
  }

  public int randomNumber (){
    return posX = (int) (Math.random() * 10);
  }
}
