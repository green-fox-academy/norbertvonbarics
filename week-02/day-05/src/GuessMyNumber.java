import java.util.Scanner;
import java.math.*;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    for (int i = 0; i < 100; i++) {
      double random = Math.floor((Math.random() * 100)+1);
      System.out.println(random);
    }

  }
}
