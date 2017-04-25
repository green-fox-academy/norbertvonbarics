
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class UserInput {
   List<Integer> myScanner() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("I need 4 digits!");
    int userInput = myScanner.nextInt();
    List<Integer> input = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      input.add(userInput % 10);
      userInput /= 10;
    }
     Collections.reverse(input);
    return input;
  }
}
