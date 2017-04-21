
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {

  private static final String DATAPATH = "./assets/data.csv";
  private static final String ERROR = "SYNTAX ERROR: ";

  static void writeToFile(List<String> data) {
    Path myPath = Paths.get(DATAPATH);
    try {
      Files.write(myPath, data);
    } catch (IOException ex) {
      System.out.println(ERROR + "WRITE");
    }
  }
}
