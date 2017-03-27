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

  public static List<String> finalList(List<String> text) {
    List<String> finalText = new ArrayList<>();
    text = readLines();
    for (int i = 0; i < text.size(); i++) {
      String corText = "";
      for (int j = text.get(i).length() - 1; j > 0; j--) {
        corText += text.get(i).charAt(j);
      }
      finalText.add(corText);
    }

    return finalText;
  }

  public static List<String> readLines() {
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