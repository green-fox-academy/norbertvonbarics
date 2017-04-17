
public class Bird extends Animal {
  Bird(String name, int age, String gender) {
    super(name, age, gender);
  }

  Bird(String name) {
    super(name);
  }

  @Override
  void greet() {
    System.out.println("Hello, I am a " + this.name + "!");
  }

  @Override
  String wantChild() {
    return "want a child from an egg!";
  }

  @Override
  void move() {
    System.out.println("I am flying!");
  }
}
