import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    String[] myArray = new String[8];
    String buffer = list.get(2);
    String buffer2 = list.get(5);
    list.set(2, buffer2);
    list.set(5, buffer);
    String listString = "";
    for (String s : list)
    {
      listString += s + " ";
    }

    System.out.println(listString);
  }
}

// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code

// Also, print the sentence to the output with spaces in between.