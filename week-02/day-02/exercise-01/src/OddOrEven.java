import java.util.Scanner;

public class OddOrEven {
  public static void main(String[] args) {
    Scanner scanner = Scanner(System.in);
    int userInput1 = scanner.nextInt();
    if (userInput1 % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}

// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.