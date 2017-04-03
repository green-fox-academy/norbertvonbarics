
public class Sharpie {
  private String color;
  private float width;
  private float inkAmount;

  public Sharpie() {
    this(null, 0, 100);
  }

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  float use() {
    return inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie item1 = new Sharpie();
    item1.color = "black";
    item1.width = 1;
    for (int i = 0; i < 40; i++) {
      item1.use();
    }
    System.out.println(item1.inkAmount);
  }
}
