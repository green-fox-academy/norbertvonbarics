public class Sponsor extends Person {

  String company;

  public Sponsor(){
    this("Jane Doe", 30, "female", "Google");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }


}
