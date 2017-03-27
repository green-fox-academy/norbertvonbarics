

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
       System.out.println(Files.exists(lotto));
       System.out.println(Files.isReadable(lotto));
       List<String> text = Files.readAllLines(lotto);
       ArrayList<String> splitted = new ArrayList<>();
       System.out.println(text);
       for (int i = 0; i < text.size(); i++) {
         splitted.add(Arrays.toString(text.get(i).split(";")));
       }
       System.out.println();
    }catch (IOException ex) {
      System.out.println("Catch executed!");
    }
    numberChecker(splitted);
    public static ArrayList numberChecker (ArrayList a){

    }


  }
}

// Create a method that find the 5 most common lotto numbers assets/lotto.csv