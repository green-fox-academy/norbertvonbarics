import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int randomNumber = (int) (15 + (Math.random() * 7));
    Deck newDeck = new Deck();
    Scanner myScanner = new Scanner(System.in);

    newDeck.fillDeck();
    newDeck.shuffleDeck();

    int userPoints = 0;

    userPoints += newDeck.drawRandom();
    System.out.println("YOUR POINTS " + userPoints);
    System.out.println("Do you want to draw another card?");

    int counter = 0;
    while ((userPoints < 21 || userPoints < randomNumber) && counter < 2){
      String input2 = myScanner.nextLine();
      if (input2.toLowerCase().equals("y")) {
        userPoints += newDeck.drawRandom();
        System.out.println("YOUR POINTS " + userPoints);
      } else if (input2.toLowerCase().equals("n")) {
        System.out.println("YOUR POINTS " + userPoints);
        counter = 2;
      }
      System.out.println("Do you want to draw another card?");
    }

    if (userPoints < 21 && userPoints > randomNumber) {
      System.out.println("YOU WIN!");
    } else {
      System.out.println("YOU LOSE!");
    }
  }
}
