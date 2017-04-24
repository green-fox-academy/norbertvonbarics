
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class WriteFile {

  private static final String DATAPATH = "./assets/data.csv";
  private static final String ERROR = "SYNTAX ERROR: ";

  static void writeToFile(List<Todo> data) {
    Path myPath = Paths.get(DATAPATH);
    List<String> dataString = new ArrayList<>();
    for (int i = 0; i < data.size(); i++){
      String tempString = data.get(i).checked + ";" + data.get(i).id + ";" + data.get(i).todo;
      dataString.add(tempString);
    }
    try {
      Files.write(myPath, dataString);
    } catch (IOException ex) {
      System.out.println(ERROR + "WRITE");
    }
  }
}
