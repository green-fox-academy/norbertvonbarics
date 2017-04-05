public class Animal {
  int hunger;
  int thirst;
  String name;

  public Animal() {
    this("el chupacabra", 50, 50);
  }

  public Animal(String name, int hunger, int thirst) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public int eat() {
    return hunger--;
  }

  public int drink() {
    return thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public static void main(String[] args) {
    Animal zebra = new Animal();

    System.out.println(zebra.hunger);
    zebra.eat();
    System.out.println(zebra.hunger);
    System.out.println(zebra.thirst);
    zebra.drink();
    System.out.println(zebra.thirst);
    for (int i = 0; i < 5; i++) {
      zebra.play();
    }
    System.out.println(zebra.thirst);
    System.out.println(zebra.hunger);
  }
}