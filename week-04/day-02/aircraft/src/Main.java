
public class Main {

  public static void main(String[] args) {
    Carrier carrier = new Carrier(1000, 100);
    Carrier enemyCarrier = new Carrier(1000, 100);
    carrier.addAircraft("f35");
    carrier.addAircraft("f35");
    carrier.addAircraft("f35");
    carrier.addAircraft("f16");
    carrier.addAircraft("f16");

    carrier.getStatus();
    System.out.println(enemyCarrier.getHealthPoints());

    System.out.println(carrier.getMaxDamage());
    carrier.fight(enemyCarrier);
    System.out.println(enemyCarrier.getHealthPoints());
    carrier.getStatus();
    carrier.fill();
    carrier.getStatus();
  }
}
