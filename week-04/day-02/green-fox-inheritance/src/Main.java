
public class Main {
  public static void main(String[] args) {
    Person myPerson = new Person();
    myPerson.introduce();
    myPerson.getGoal();

    Student myStudent = new Student();
    myStudent.introduce();
    myStudent.getGoal();

    Mentor myDeMentor = new Mentor();
    myDeMentor.introduce();
    myDeMentor.getGoal();

    Sponsor mySponsor = new Sponsor();
    mySponsor.introduce();
    mySponsor.getGoal();
    mySponsor.hire();
  }
}

