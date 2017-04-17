
public abstract class Animal {
  String name;
  int age;
  String gender;

  Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Animal(String name) {
    this.name = name;
  }

  abstract void greet();
  abstract String wantChild();
  abstract void move();

  public String getName() {
    return name;
  }
}