
public class Main {

  public static void main(String[] args) {
    Parkinglot parkinglot = new Parkinglot();
    parkinglot.fillParkinglot();
    System.out.println(parkinglot.parkinglot);

    System.out.println(parkinglot.SameColors(parkinglot.parkinglot));
    System.out.println(parkinglot.SameVehicles(parkinglot.parkinglot));
    System.out.println(parkinglot.vehicleOccurence(parkinglot.parkinglot));
    parkinglot.mostOccuringVehicle(parkinglot.vehicleOccurence(parkinglot.parkinglot));
  }
}
