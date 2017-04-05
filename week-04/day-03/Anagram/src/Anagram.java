import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    String userInput1 = "asdf";
    String userInput2 = "fdsa";
    System.out.println(isAnagram(userInput1, userInput2));
    if (isAnagram(userInput1, userInput2)) {
      System.out.println("Anagram found!");
    } else {
      System.out.println("Better luck next time!");}
  }

  public static boolean isAnagram(String user1, String user2) {
    String[] userArray1 = user1.split("");
    String[] userArray2 = user2.split("");
    Arrays.sort(userArray1);
    Arrays.sort(userArray2);
    user1 = Arrays.toString(userArray1);
    user2 = Arrays.toString(userArray2);
    return (user1.equals(user2));
  }
}
