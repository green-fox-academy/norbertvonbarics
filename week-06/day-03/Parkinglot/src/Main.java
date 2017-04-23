
public class Main {

  public static void main(String[] args) {
    Parkinglot parkinglot = new Parkinglot();
    parkinglot.fillParkinglot();
    System.out.println("These cars are in the parkinglot:");
    System.out.println(parkinglot.getParkinglot());
    System.out.println("These are the colors of the cars:");
    System.out.println(parkinglot.SameColors(parkinglot.getParkinglot()));
    System.out.println("These are the types:");
    System.out.println(parkinglot.SameVehicles(parkinglot.getParkinglot()));
    System.out.println("This is the most occured vehicle:");
    parkinglot.mostOccuringVehicle(parkinglot.vehicleOccurence(parkinglot.getParkinglot()));
  }
}
