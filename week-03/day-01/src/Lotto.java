

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lotto {
  public static void main(String[] args) {
    Path lotto = Paths.get("otos.txt");
    try {
      List<String> text = Files.readAllLines(lotto);
      ArrayList<String> numbers = new ArrayList<>();
      String[] separate = {};
      for (String line : text) {
        separate = line.split(";");
        for (int i = separate.length - 1; i > separate.length - 6; i--) {
          numbers.add(separate[i]);
        }
      }
      System.out.println(numbers);
    } catch (IOException ex) {
      System.out.println("Catch executed!");
    }
    /*numberChecker(splitted)
  }
  public static ArrayList numberChecker(ArrayList a) {
    System.out.println(a);

    return */
  }

}

// Create a method that find the 5 most common lotto numbers assets/lotto.csv