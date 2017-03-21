import java.util.Scanner;
public class TwoNumberCompare {
  public static void main(String[] args) {
    Scanner scanner = Scanner(System.in);
    System.out.println("give me a number!");
    int userInput1 = new scanner.nextInt();
    System.out.println("an another one...");
    int userInput2 = new scanner.nextInt();
  }
}
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5