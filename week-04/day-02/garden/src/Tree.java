public class Tree extends Plant {
  double minWaterLevel;

  public Tree() {
    this(0.0, "green", 10.0);
  }

  public Tree(double waterLevel, String color, double minWaterLevel) {
    super(waterLevel, color);
    this.minWaterLevel = 10.0;
  }

  @Override
  public void addWater(double number) {
    if (waterLevel < minWaterLevel) {
      double neededWater = minWaterLevel - waterLevel;
      if (neededWater > number * .75) {
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
