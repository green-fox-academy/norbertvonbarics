import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  List<Card> deck = new ArrayList<>();

  @Override
  public String toString() {
    return "" +deck;
  }

  public void fillDeck() {
    String cardColor = "";
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        if (Suit.values()[i].name().equals("HEARTS") || Suit.values()[i].name().equals("DIAMONDS")) {
          cardColor = Color.values()[0].name();
        } else {
          cardColor = Color.values()[1].name();
        }
        Card newCard = new Card(Rank.values()[j].getValue(), Suit.values()[i].name(), cardColor);
        deck.add(newCard);
      }
    }
  }

  void shuffleDeck (){
    Collections.shuffle(deck);
  }

  void drawFirst (){
    System.out.println(deck.get(0));
    deck.remove(0);
  }

  void drawLast () {
    System.out.println(deck.get(deck.size()-1));
    deck.remove(deck.size()-1);
  }

  int drawRandom () {
    int random = (int) (Math.random()*deck.size()-1);
    int tempNumber;
    System.out.println(deck.get(random));
    tempNumber = deck.get(random).getValue();
    deck.remove(random);
  return tempNumber;
  }
}
