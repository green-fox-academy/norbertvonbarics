public class Station {
  int gas;
  int capacity;

  public Station() {
    this(1000);
  }

  public Station(int gas) {
    this.gas = gas;
  }

  public void refill(Car bmw) {
    bmw.gas++;
    bmw.capacity--;
  }
}
