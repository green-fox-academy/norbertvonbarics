import java.util.Arrays;

public class Dice {

  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reroll();
    myDice.getCurrent();
    myDice.reroll(4);
    myDice.getCurrent();

    rollSixDice(myDice);
  }

  private static void rollSixDice(Dice myDice) {
    for (int i = 0; i < myDice.getCurrent().length; i++) {
      while (myDice.getCurrent(i) != 6) {
        myDice.reroll(i);
      }
    }
    System.out.println(Arrays.toString(myDice.getCurrent()));
  }

  private int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  private int[] getCurrent() {
    return dices;
  }

  private int getCurrent(int i) {
    return dices[i];
  }

  private void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  private void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
}