import java.util.ArrayList;

public class LagopusClass {
  ArrayList<Student> students = new ArrayList<>();
  ArrayList<Mentor> mentors = new ArrayList<>();
  private String className;

  public LagopusClass(String className){
    this.className = className;
  }

  public LagopusClass(String className, ArrayList students, ArrayList mentors) {
    this.className = className;
    this.students = students;
    this. mentors = mentors;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " +  class has " + students.size() + " students and " + mentors.size()  + " mentors.");
  }
}
