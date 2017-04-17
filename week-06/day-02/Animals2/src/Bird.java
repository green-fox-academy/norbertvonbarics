
public class Bird extends Animal {
  Bird(String name, int age) {
    super(name, age);
  }

  @Override
  void greet() {

  }

  @Override
  String wantChild() {
    return "want a child from an egg!";
  }
}
