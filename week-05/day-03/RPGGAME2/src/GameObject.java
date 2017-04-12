
public class GameObject {
  int posX;
  int posY;
  String costume;

  public GameObject() {
    this(0, 0, "./assets/hero-down.png");
  }

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }

  public GameObject(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }
}
