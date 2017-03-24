import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    double random = Math.floor((Math.random() * 100) + 1);
    int myInt = (int) random;
    System.out.println(myInt);
    Scanner myScanner = new Scanner(System.in);

    for (int i = 0;i < 3; i++) {
      int userInput = myScanner.nextInt();
      if ((i == 2) && (myInt !=  userInput)) {
        System.out.println("YOU LOSE!");
      } else if (myInt != userInput) {
        System.out.println("Guess angain!");
      } else if (myInt == userInput) {
        System.out.println("YOU WIN!");
      }
    }
  }
}
