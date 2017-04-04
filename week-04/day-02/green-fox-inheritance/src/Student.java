
public class Student extends Person {
  private int numberOfDays;
  private int skippedDays;

  String previousOrganization;

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life");
  skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void intrudouce(){
    System.out.println("Hi, I'm " + name + ", a "+ age + " year old "+ gender + " from " + previousOrganization +  " who skipped" + skippedDays + "days from the course already.");
  }
}
