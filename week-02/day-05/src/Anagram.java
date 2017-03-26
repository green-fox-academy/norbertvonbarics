import java.lang.reflect.Array;
import java.util.Arrays;
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
    String[] userArray1 = user1.split("");
    String[] userArray2 = user2.split("");
    Arrays.sort(userArray1);
    Arrays.sort(userArray2);
    System.out.println(Arrays.toString(userArray1));
    System.out.println(Arrays.toString(userArray2));
    return (user1.equals(user2));
  }
}
