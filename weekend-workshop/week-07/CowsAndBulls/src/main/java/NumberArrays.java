import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class NumberArrays {

  private String stringNumber;
  private int number;
  private List<Integer> digits;

  NumberArrays(int number) {
    this.number = number;
    this.digits = new ArrayList<Integer>();
    digits = new ArrayList<Integer>();
    for (int i = 0; i < number; ++i) {
      digits.add((int) (Math.random() * 10));
    }
    System.out.println(digits);
  }

  NumberArrays(String stringNumber) {
    this.stringNumber = stringNumber;
    int number = Integer.parseInt(stringNumber);
    this.digits = new ArrayList<Integer>();
    Scanner myScanner = new Scanner(System.in);
    int userInput = myScanner.nextInt();
    for (int i = 0; i < number; i++) {
      digits.add(userInput % 10);
      userInput /= 10;
    }
    Collections.reverse(digits);
    System.out.println(digits);
  }
}
