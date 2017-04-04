public class Tree extends Plant {

  public Tree() {
    this(0.0, 10.0, "green",  10);
  }

  public Tree(double waterLevel, double absorb, String color, int minWaterLevel) {
    super(waterLevel, absorb, color, minWaterLevel);
    this.minWaterLevel = 10;
  }
}
