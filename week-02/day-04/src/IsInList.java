import java.util.*;

public class IsInList {

  public static void main(String... args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 5, 12, 16));
    boolean answer = list1.containsAll(list2);
    System.out.println(answer);
  }
}

// Check if list contains all of the following elements: 4,8,12,16
// Print "true" if it contains all, otherwise print "false"
// Can you do both the different approaches you tried in the previous one?