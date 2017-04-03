import java.util.Arrays;

public class Sharpie {
  private String color;
  private float width;
  private float inkAmount;

  public Sharpie() {
    this("red", 0, 100);
  }

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  float use() {
    return inkAmount--;
  }

  public float getInkAmount() {
    return inkAmount;
  }

  public static void main(String[] args) {
    Sharpie item1 = new Sharpie();
    item1.color = "black";
    item1.width = 1;

    Sharpie item2 = new Sharpie();
    item2.color = "black";
    item2.width = 1;
    item2.inkAmount = 30;

    Sharpie item3 = new Sharpie();
    item3.color = "black";
    item3.width = 1;
    item3.inkAmount = 0;

    System.out.println(item1.inkAmount);
    System.out.println(item2.inkAmount);
    System.out.println(item3.inkAmount);

    SharpieSet set2 = new SharpieSet();

    set2.add(item1);
    set2.add(item2);
    set2.add(item3);

    set2.counter();
    set2.remove();
    System.out.println(set2);
  }
}
