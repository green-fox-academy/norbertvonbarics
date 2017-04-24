import java.util.ArrayList;
import java.util.List;

class PrintList {

  private static List<Todo> todoList = ReadFile.readFiles();
  private static List<String> printedList = new ArrayList<>();

  static void printList(String[] args) {

    if (args[0].equals("-la")) {
      printAll();
    } else if (args[0].equals("-l")) {
      printUnchecked();
    }
  }

  static void printAll() {
    for (int i = 0; i < todoList.size(); i++) {
      if (!todoList.get(i).checked) {
        printedList.add((i + 1) + " [ ] #ID:" + todoList.get(i).id + " " + todoList.get(i).todo);
      } else {
        printedList.add((i + 1) + " [X] #ID:" + todoList.get(i).id + " " + todoList.get(i).todo);
      }
    }
    for (String lines : printedList) {
      System.out.println(lines);
    }
  }

  private static void printUnchecked() {
    for (int j = 0; j < todoList.size(); j++) {
      if (!todoList.get(j).checked) {
        printedList.add((j + 1) + "[ ] #ID:" + todoList.get(j).id + " " + todoList.get(j).todo);
      }
    }
    for (String lines : printedList) {
      System.out.println(lines);
    }
  }
}
