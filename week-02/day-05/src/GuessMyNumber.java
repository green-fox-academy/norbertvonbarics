import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Please add the range of the number I have to think!");
    int range = myScanner.nextInt();
    System.out.println("Okay, my number is between 0 and" + " " + range);

    double random = Math.floor((Math.random() * range) + 1);
    int myInt = (int) random;

    for (int i = 10; i > 0; i--) {
      int userInput = myScanner.nextInt();
      if ((i == 1) && (myInt != userInput)) {
        System.out.println(" __     ______  _    _       \n" +
                " \\ \\   / / __ \\| |  | |      \n" +
                "  \\ \\_/ / |  | | |  | |      \n" +
                "   \\   /| |  | | |  | |      \n" +
                "    | | | |__| | |__| |      \n" +
                "  _ |_|  \\____/ \\____/______ \n" +
                " | |    / __ \\ / ____|  ____|\n" +
                " | |   | |  | | (___ | |__   \n" +
                " | |   | |  | |\\___ \\|  __|  \n" +
                " | |___| |__| |____) | |____ \n" +
                " |______\\____/|_____/|______|\n" +
                "                             \n" +
                "                             ");
        System.out.println("MY number was" + " " + myInt);
      } else if (myInt != userInput) {
        if (myInt > userInput) {
          System.out.println("Your number is to low!");
        } else {
          System.out.println("Your number is too high!");
        }
        System.out.println("Guess again!" + " " + "remain guesses: " + (i - 1));
      } else if (myInt == userInput) {
        System.out.println(" __     ______  _    _     \n" +
                " \\ \\   / / __ \\| |  | |    \n" +
                "  \\ \\_/ / |  | | |  | |    \n" +
                "   \\   /| |  | | |  | |    \n" +
                "    | | | |__| | |__| |    \n" +
                " __ |_|  \\____/_\\____/   _ \n" +
                " \\ \\        / /_   _| \\ | |\n" +
                "  \\ \\  /\\  / /  | | |  \\| |\n" +
                "   \\ \\/  \\/ /   | | | . ` |\n" +
                "    \\  /\\  /   _| |_| |\\  |\n" +
                "     \\/  \\/   |_____|_| \\_|\n" +
                "                           \n" +
                "                           ");
        System.out.println("My number is " + myInt + "!");
      }
    }
  }
}