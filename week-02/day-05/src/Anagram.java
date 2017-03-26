import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("");
    String userInput1 = myScanner.nextLine();
    String userInput2 = myScanner.nextLine();
    System.out.println(userInput1);
    System.out.println(userInput2);
    System.out.println(isAnagram(userInput1, userInput2));

  }

  public static boolean isAnagram(String user1, String user2) {
    StringBuilder reverser = new StringBuilder(user2);
    String reversedUser2 = reverser.reverse().toString();
    return (user1.equals(reversedUser2));
  }
}
