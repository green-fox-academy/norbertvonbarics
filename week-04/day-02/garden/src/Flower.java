
public class Flower extends Plant {

  public Flower() {
    this(0.0, 0.75, "red", 5);
  }

  public Flower(double waterLevel, double absorb, String color, int minWaterLevel) {
    super(waterLevel, absorb, color, minWaterLevel);
    this.minWaterLevel = 5;
  }
}
