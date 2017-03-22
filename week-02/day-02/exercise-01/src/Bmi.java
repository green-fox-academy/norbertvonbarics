public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;
    double sqrHeight = heightInM * heightInM;
    double bmi = massInKg / sqrHeight;
    System.out.println(bmi);
  }
}

// Print the Body mass index (BMI) based on these values