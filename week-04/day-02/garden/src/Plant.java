
public class Plant {
  double waterLevel;
  String color;
  double minWaterLevel;

  public Plant() {
    this(0.0, "black");
  }

  public Plant(double waterLevel, String color) {
    this.waterLevel = waterLevel;
    this.color = color;
  }

  public double getWaterLevel() {
    return this.waterLevel;
  }

  public void addWater (double number) {
    this.waterLevel += number;
  }

  public double getMinWaterLevel() {
    return this.minWaterLevel;
  }

  public String getColor() {
    return this.color;
  }
}
