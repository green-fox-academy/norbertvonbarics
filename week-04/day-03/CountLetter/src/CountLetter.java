import java.util.HashMap;
import java.util.Map;

public class CountLetter {

  public static void main(String[] args) {
    String letters = "abcdefghijklmnopqrs";
    System.out.println(letterCounter(letters));
  }

  public static Map<String, Integer> letterCounter(String letters) {
    Map <String, Integer> letterMap = new HashMap<>();
    for (int i = 0; i < letters.length(); i++) {
      letterMap.put(letters.substring(i, i+1), i);
    }
    return letterMap;
  }
}
