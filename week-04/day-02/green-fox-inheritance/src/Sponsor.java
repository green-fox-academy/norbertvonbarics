public class Sponsor extends Person {

  String company;

  public Sponsor(){
    this("Jane Doe", 30, "female", "Google");
  }

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }


}
