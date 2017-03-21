import java.util.Scanner;
public class TwoInputPrintTheBigger {
  public static void main(String[] args) {
    System.out.println("Please add two numbers!");
    Scanner scanner = new Scanner(System.in);
    int userInput1 = scanner.nextInt();
    System.out.println("add one more!");
    int userInput2 = scanner.nextInt();
    String note = " is bigger!";
    if (userInput1 < userInput2) {
      System.out.println(userInput2 + note);
    } else {
      System.out.println(userInput1 + note);
    }
  }
}



// Write a program that asks for two numbers and prints the bigger one