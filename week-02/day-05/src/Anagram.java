import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
  }

  public static boolean isAnagram(String possibleAnagram) {
    StringBuilder testAna = new StringBuilder(possibleAnagram);
    String reversed = testAna.reverse().toString();
    
  }
}
