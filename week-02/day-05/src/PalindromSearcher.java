import java.util.ArrayList;
import java.util.Scanner;

public class PalindromSearcher {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();
    ArrayList<String> palindromList = new ArrayList <String>;


    isPalindrom(input);
    System.out.println(isPalindrom(input));
  }

  public static boolean isPalindrom (String verse) {
    StringBuilder reverser = new StringBuilder(verse);
    String reversed = reverser.reverse().toString();
    return verse.equals(reversed);
  }

}
