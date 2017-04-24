/*
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one
 */
public class Animal {
  private int hunger;
  private int thirst;
  private String name;

  private Animal() {
    this("el chupacabra", 50, 50);
  }

  private Animal(String name, int hunger, int thirst) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  private int eat() {
    return hunger--;
  }

  private int drink() {
    return thirst--;
  }

  private void play() {
    hunger++;
    thirst++;
  }

  public static void main(String[] args) {
    Animal zebra = new Animal("zebra", 50,50);

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
