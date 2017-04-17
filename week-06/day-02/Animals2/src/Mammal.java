
public class Mammal extends Animal {
  Mammal(String name, int age) {
    super(name, age);
  }

  @Override
  void greet() {
    System.out.println("Hello, I am a " + this.name);
  }

  @Override
  String wantChild() {
    return "want a child from my uterus!";
  }
}
