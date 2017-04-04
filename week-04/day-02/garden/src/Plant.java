
public class Plant {
  double water;
  double absorb;
  String color;

  public Plant() {
    this(0.0, 10.0, "black");
  }

  public Plant(double water, double absorb, String color) {
    this.water = water;
    this.absorb = absorb;
  }

}
