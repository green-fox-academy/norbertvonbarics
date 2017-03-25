import java.util.Scanner;

public class PalindromBuilder {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();

    palindromeSearcher(input);
    System.out.println(input);
    System.out.println(palindromeSearcher(input));
  }
  public static String palindromeSearcher(String a) {
    String reversed = "";
    for(int i = a.length()-1; i > -1; i--) {
      reversed += a.charAt(i);
    }
    String finalString = a.concat(reversed);
    return finalString;
  }
}