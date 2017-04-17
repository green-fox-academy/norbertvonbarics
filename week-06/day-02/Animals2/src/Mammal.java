
public class Mammal extends Animal {
  Mammal(String name, int age, String gender) {
    super(name, age, gender);
  }

  Mammal (String name) {
    super(name);
  }


  @Override
  void greet() {
    System.out.println("Hello, I am a " + this.name + "!");
  }

  @Override
  String wantChild() {
    return "want a child from its uterus!";
  }

  @Override
  void move() {
    System.out.println("I am walking!");
  }
}
