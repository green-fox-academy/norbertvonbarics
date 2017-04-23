
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class DuplicatedChars {

  public static void main(String[] args) {
    System.out.println(removeDoubleChars());
  }

  private static List<String> removeDoubleChars() {
    Path duplicate = Paths.get("duplicated-chars.txt");
    ArrayList<String> finalText = new ArrayList<>();
    try {
      List<String> text = Files.readAllLines(duplicate);
      for (String aText : text) {
        String coreText = "";
        for (int j = 0; j < aText.length(); j += 2) {
          coreText += aText.charAt(j);
        }
        finalText.add(coreText);
      }
    } catch (IOException ex) {
      System.out.println("SYNTAX ERROR");
    }
    return finalText;
  }
}
