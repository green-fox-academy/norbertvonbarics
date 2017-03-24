import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    double random = Math.floor((Math.random() * 100) + 1);
    int myInt = (int) random;
    System.out.println(myInt);
    Scanner myScanner = new Scanner(System.in);

    for (int i = 3;i > 0; i--) {
      int userInput = myScanner.nextInt();
      if ((i == 1) && (myInt !=  userInput)) {
        System.out.println("YOU LOSE! MY number was" + " " + (int) random);
      } else if (myInt != userInput) {
          if (myInt > userInput){
            System.out.println("Your number is to low!");
          } else {
            System.out.println("Your number is too high!");
          }
        System.out.println("Guess angain!" + " " + "remain guesses: " + (i-1));
      } else if (myInt == userInput) {
        System.out.println("YOU WIN!");
      }
    }
  }
}
