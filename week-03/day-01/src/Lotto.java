

import java.io.IOException;
import java.lang.reflect.Array;
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
      String[] separate = {};
      for (String line : text) {
        separate = line.split(";");
        for (int i = separate.length - 1; i > separate.length - 6; i--) {
          numbers.add(separate[i]);
        }
      }
     /* System.out.println(numbers);*/
    } catch (IOException ex) {
      System.out.println("Catch executed!");
    }


    System.out.println(numbers);
    HashMap<String, Integer> sorted = new HashMap<>();

    for (
            int i = 0; i < numbers.size(); i++)

    {
      Integer count = sorted.get(numbers.get(i));
    /*  sorted.put(numbers.get(i)), count == null ? 1 : count + 1;*/
    }
  }
}

// Create a method that find the 5 most common lotto numbers assets/lotto.csv