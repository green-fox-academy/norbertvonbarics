import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Please add the range of the number I have to think!");
    int range = myScanner.nextInt();
    System.out.println("Okay, my number is between 0 and" + " " + range);

    double random = Math.floor((Math.random() * range) + 1);
    int myInt = (int) random;
    System.out.println(myInt);

    for (int i = 3; i > 0; i--) {
      int userInput = myScanner.nextInt();
      if ((i == 1) && (myInt != userInput)) {
        System.out.println("YOU LOSE! MY number was" + " " + (int) random);
      } else if (myInt != userInput) {
        if (myInt > userInput) {
          System.out.println("Your number is to low!");
        } else {
          System.out.println("Your number is too high!");
        }
        System.out.println("Guess again!" + " " + "remain guesses: " + (i - 1));
      } else if (myInt == userInput) {
        System.out.println("YOU WIN!");
      }
    }
  }
}