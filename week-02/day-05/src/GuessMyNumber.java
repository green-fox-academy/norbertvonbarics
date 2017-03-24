import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Please select the difficulty of the game:\n 1 - Easy \n 2 - Medium \n 3 - Hard");
    int range = myScanner.nextInt();
    int lives = 0;

    if (range == 3) {
      lives = 5;
      range = 200;
    } else if (range == 2) {
      lives = 10;
      range = 100;
    } else if (range == 1) {
      lives = 5;
      range = 50;
    }

    System.out.println("Okay, my number is between 0 and" + " " + range + "!");

    double random = Math.floor((Math.random() * range) + 1);
    int myInt = (int) random;


    System.out.println("You have" + " " + lives+ " " + "lives! \n What is your first guess?");
    for (int i = lives; i > 0; i--) {
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
          System.out.println("Your number is too low!");
        } else {
          System.out.println("Your number is too high!");
        }
        System.out.println("Guess again!" + " " + "You have" + " " + (i - 1) + " "+  "more guesses!");
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