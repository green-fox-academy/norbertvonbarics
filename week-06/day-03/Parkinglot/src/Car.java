import java.awt.Color;

public class Car {

  Colors color;
  Types type;

  @Override
  public String toString() {
    return color + " " + type;
  }

  Car() {
    this.color = Colors.randomColors();
    this.type = Types.randomType();
  }

  public Colors getColor() {
    return color;
  }

  public Types getType() {
    return type;
  }
}
