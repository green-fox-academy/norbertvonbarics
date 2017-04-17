class Mammal extends Animal implements Herbivore, Carnivore {
  Mammal(String name, int age, String gender) {
    super(name, age, gender);
  }

  Mammal(String name) {
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
  String move() {
    return "is walking";
  }

  @Override
  public String eat() {
    return "eating flesh and vegetables!";
  }

  @Override
  public String eatMeat() {
    return "eating flesh!";
  }

  @Override
  public String eatLeaves() {
    return "eating leaves!";
  }
}
