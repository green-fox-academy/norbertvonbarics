import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int number = 8;
    System.out.println("I guessed a number!");
    int userInput = myScanner.nextInt();
    while (userInput != number) {
      if (userInput < number) {
        System.out.println("The stored number is higher!");
      } else {
        System.out.println("The stored number is lower!");
      }
      System.out.println("You found the number: " + number);
    }
  }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
