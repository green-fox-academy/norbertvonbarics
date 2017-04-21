import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class ReadFile {

  private static final String DATAPATH = "./assets/data.csv";
  private static final String ERROR = "SYNTAX ERROR: ";

  static List<String> readFiles() {
    List<String> rawLines = new ArrayList<>();
    Path myPath = Paths.get(DATAPATH);
    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println(ERROR + "READ");
    }
    return rawLines;
  }
}
