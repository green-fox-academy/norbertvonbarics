

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lotto {

  public static void main(String[] args) {
    Path lotto = Paths.get("otos.txt");
    ArrayList<String> numbers = new ArrayList<>();
    try {
      List<String> text = Files.readAllLines(lotto);
      String[] separate;
      for (String line : text) {
        separate = line.split(";");
        for (int i = separate.length - 1; i > separate.length - 6; i--) {
          numbers.add(separate[i]);
        }
      }
    } catch (IOException ex) {
      System.out.println("Catch executed!");
    }

    HashMap<String, Integer> sorted = new HashMap<>();

    for (String number : numbers) {
      if (sorted.containsKey(number)) {
        sorted.put(number, sorted.get(number) + 1);
      } else {
        sorted.put(number, 1);
      }
    }

    List<Integer> values = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
      values.add(entry.getValue());
    }
    Collections.sort(values);

    Map<String, Integer> mostCommonNumbers = new HashMap<>();

    for (int k = 0; k < 6; k++) {
      Map.Entry<String, Integer> maxEntry = null;
      for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
        if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
          maxEntry = entry;
        }
      }
      assert maxEntry != null;

      mostCommonNumbers.put(maxEntry.getKey(), maxEntry.getValue());
      sorted.remove(maxEntry.getKey(), maxEntry.getValue());
    }
    System.out.println(mostCommonNumbers);
  }
}
// Create a method that find the 5 most common lotto numbers assets/lotto.csv