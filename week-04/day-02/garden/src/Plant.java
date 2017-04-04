
public class Plant {
  double waterLevel;
  double absorb;
  String color;
  int minWaterLevel;

  public Plant() {
    this(0.0, 10.0, "black", 10);
  }

  public Plant(double water, double absorb, String color, int minWaterLevel) {
    this.waterLevel = water;
    this.absorb = absorb;
  }

  public double getWaterLevel() {
    return this.waterLevel;
  }

  public void addWater (double number) {
    this.waterLevel *= number;
  }
}
