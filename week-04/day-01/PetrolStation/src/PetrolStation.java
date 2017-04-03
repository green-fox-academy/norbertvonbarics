public class PetrolStation {
  public static void main(String[] args) {
    Station shell = new Station();
    Car bmw = new Car();

    System.out.println(bmw.gas);
    System.out.println(bmw.capacity);
    for (int i = 0; i < 50; i++) {
      shell.refill(bmw);
    }
    System.out.println(bmw.gas);
    System.out.println(bmw.capacity);

  }
}
