
public class Card {
  int value;
  private String name;
  private String color;

  public Card(int value, String name, String color) {
    this.value = value;
    this.name = name;
    this.color = color;
  }

  @Override
  public String toString() {
    return this.value + " " + this.name + " " + this.color;
  }

  public int getValue() {
    return value;
  }
}




