public class Zoo {

  public static void main(String[] args) {
    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("Tell something about yourself!");
    System.out.println("");
    reptile.greet();
    System.out.println("A " + reptile.getName() + " is " + reptile.wantChild());
    System.out.println("A " + reptile.getName() + " " + reptile.move() + ", and " + reptile.eat());

    System.out.println("");
    mammal.greet();
    System.out.println("A " + mammal.getName() + " is " + mammal.wantChild());
    System.out.println("A " + mammal.getName() + " " + mammal.move() + ", and " + mammal.eatLeaves());

    System.out.println("");
    bird.greet();
    System.out.println("A " + bird.getName() + " is " + bird.wantChild());
    System.out.println("A " + bird.getName() + " " + bird.move() + ", but " + bird.fly() + ", and " + bird.eat());
  }
}