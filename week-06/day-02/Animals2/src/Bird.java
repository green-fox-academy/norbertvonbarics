
public class Bird extends Animal implements Fly {
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
  String move() {
    return "is flapping in the ground";
  }

  @Override
  public String fly() {
    return "flying above the clouds";
  }

  @Override
  String eat() {
    return "eating seeds!";
  }
}
