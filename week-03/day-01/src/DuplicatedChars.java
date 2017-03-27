import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicatedChars {
  public static void main(String[] args) {
    Path duplicate = Paths.get("duplicated-chars.txt");
    ArrayList<String> finalText = new ArrayList<>();
    try {
      List<String> text = Files.readAllLines(duplicate);
      for (int i = 0; i < text.size(); i++) {
        String corText = "";
        for (int j = 0;j < text.get(i).length(); j += 2){
          corText += text.get(i).charAt(j);
        }
        finalText.add(corText);
      }
    } catch (IOException ex) {
      System.out.println("SYNTAX ERROR");
    }
    System.out.println(finalText);
  }
}
