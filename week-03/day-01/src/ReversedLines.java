import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    System.out.println(finalList(readLines()));

  }

  private static List<String> finalList(List<String> text) {
    List<String> finalText = new ArrayList<>();
    text = readLines();
    for (String aText : text) {
      String corText = "";
      for (int j = aText.length() - 1; j > 0; j--) {
        corText += aText.charAt(j);
      }
      finalText.add(corText);
    }
    return finalText;
  }

  private static List<String> readLines() {
    List<String> lines;
    Path reversedLines = Paths.get("assets/reversed-lines.txt");
    try {
      lines = Files.readAllLines(reversedLines);
    } catch (IOException ex) {
      System.out.println("SYNTAX ERROR");
      lines = new ArrayList<>();
    }
    return lines;
  }
}
// Create a method that decrypts assets/reversed_zen_lines.txt