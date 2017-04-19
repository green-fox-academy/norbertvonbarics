
public class Game {
  public static void main(String[] args) {
    int randomNumber = (int) (15 + (Math.random() * 7));
    Deck newDeck = new Deck();
    newDeck.fillDeck();
    System.out.println(newDeck.toString());
    newDeck.shuffleDeck();
    System.out.println(newDeck);

    newDeck.drawFirst();
    System.out.println(newDeck);
    newDeck.drawLast();
    System.out.println(newDeck);
    newDeck.drawRandom();
    System.out.println(newDeck);
  }
}
