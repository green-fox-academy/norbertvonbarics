import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromSearcher {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();
    ArrayList<String> palindromList = new ArrayList<String>();
    System.out.println(isPalindrom(input));
    System.out.println(Arrays.toString(palindromList.toArray()));

    for (int i = 2; i < input.length(); i++) {
      int counter = i;
      for (int j = 0; j < input.length() - i; j++) {
        if (input.charAt(counter) == input.charAt(j)) {
          String maybeP = input.substring(j, counter + 1);
          if (isPalindrom(maybeP)) {
            palindromList.add(maybeP);
          }
        }
        counter++;
      }
    }
    System.out.println(palindromList);
  }

  private static boolean isPalindrom(String verse) {
    StringBuilder reverser = new StringBuilder(verse);
    String reversed = reverser.reverse().toString();
    return (verse.equals(reversed));
  }
}
