
public class Animal {
  String name;
  int age;
  String childType;

  Animal(String name, int age, String childType) {
    this.name = name;
    this.age = age;
    this.childType = childType;
  }

  Animal() {
  }

  void greet() {
    System.out.println("Hello, I am a " + this.name);
  }

  String wantChild() {
    return "want child from an " + this.childType + "!";
  }

  String getName() {
    return this.name;
  }
}
