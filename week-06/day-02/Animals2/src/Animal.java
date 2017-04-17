
abstract class Animal {
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
  abstract String move();
  abstract String eat();

  String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }
}