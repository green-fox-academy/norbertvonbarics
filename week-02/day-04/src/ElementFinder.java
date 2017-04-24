import java.util.*;

public class ElementFinder {

  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7));
    String answer = arrayList.contains(7) ? "Hoorray" : "Nooooo";
    System.out.println(answer);
  }
}

// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!