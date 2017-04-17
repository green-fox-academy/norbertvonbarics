
public abstract class Animal {
  String name;
  int age;
  String childType;

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  abstract void greet();

  abstract String wantChild();

  public String getName() {
    return name;
  }
}