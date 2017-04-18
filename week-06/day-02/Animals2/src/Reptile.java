
class Reptile extends Animal {
  Reptile(String name, int age, String gender) {
    super(name, age, gender);
  }

  Reptile(String name) {
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
    return "is crawling";
  }

  @Override
  String eat() {
    return "eating flesh!";
  }
}
