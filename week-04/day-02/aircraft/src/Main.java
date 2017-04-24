
public class Main {

  public static void main(String[] args) {
    Carrier carrier = new Carrier(1000, 100);
    carrier.addAircraft("f35");
    carrier.addAircraft("f35");
    carrier.addAircraft("f35");
    carrier.addAircraft("f16");
    carrier.addAircraft("f16");
    System.out.println(carrier.getAircraftList());
  }
}
