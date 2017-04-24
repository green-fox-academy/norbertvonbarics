import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class ReadFile {

  private static final String DATAPATH = "./assets/data.csv";
  private static final String ERROR = "SYNTAX ERROR: ";

  static List<Todo> readFiles() {
    List<String> rawLines = new ArrayList<>();
    Path myPath = Paths.get(DATAPATH);
    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println(ERROR + "READ");
    }
    List<Todo> todos = new ArrayList<>();
    for (String rawLine : rawLines) {
      String[] tempElements = rawLine.split(";");
      boolean checked = tempElements[0].equals("true");
      Todo todo = new Todo(checked, Integer.parseInt(tempElements[1]), tempElements[2]);
      todos.add(todo);
    }
    return todos;
  }
}
