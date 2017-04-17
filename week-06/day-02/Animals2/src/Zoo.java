public class Zoo {

  public static void main(String[] args) {
    Reptile reptile = new Reptile("Crocodile", 4);
    Mammal mammal = new Mammal("Koala", 3);
    Bird bird = new Bird("Parrot", 2);

    System.out.println("Who want a baby?");
    System.out.println(reptile.getName() + ", " + reptile.wantChild());
    System.out.println(mammal.getName() + ", " + mammal.wantChild());
    System.out.println(bird.getName() + ", " + bird.wantChild());
  }
}