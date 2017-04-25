import java.util.List;

class Engine {

  static void play() {
    List<Integer> number = RandomNumber.randomNumber();
    UserInput newInput = new UserInput();
    int counter = 5;
    int win = 0;
    System.out.println("Guess a 4 digit number!");

    while ((counter > 0) && (win < 1)) {
      System.out.println("You have " + counter + " chance!");

      List<Integer> input = newInput.myScanner();

      for (int i = 0; i < 4; i++) {
        if (number.get(i).equals(input.get(i))) {
          System.out.println("COW!!");
        } else if (number.contains(input.get(i))) {
          System.out.println("BULL!");
        } else {
          System.out.println("X");
        }
      }
      counter--;

      String userInputString = "";
      String enemyNumber = "";
      for (int i = 0; i < number.size(); i++) {
        userInputString += input.get(i);
        enemyNumber += number.get(i);
      }
      if (userInputString.equals(enemyNumber)) {
        win += 1;
      }
    }
    if (counter == 0) {
      System.out.println("YOU LOSE!");
    } else {
      System.out.println("YOU WIN!");
    }
    System.out.println(number);
  }
}
