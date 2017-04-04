
public class Flower extends Plant {
  double minWaterLevel;

  public Flower() {
    this(0.0, "red", 5.0);
  }

  public Flower(double waterLevel, String color, double minWaterLevel) {
    super(waterLevel, color);
    this.minWaterLevel = 5.0;
  }

  @Override
  public void addWater(double number) {
    if (waterLevel < minWaterLevel) {
      double neededWater = minWaterLevel - waterLevel;
      if (neededWater  > number * .75) {
        this.waterLevel += number * .75;
      } else {
        this.waterLevel += neededWater;
      }
    }
  }

  public double getMinWaterLevel() {
    return this.minWaterLevel;
  }

  public String getColor() {
    return this.color;
  }
}
