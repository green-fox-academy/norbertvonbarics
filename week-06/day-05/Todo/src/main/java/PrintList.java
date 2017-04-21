import java.util.List;

class PrintList {

  static void printList(String[] args) {
    List<String> todoList = ReadFile.readFiles();
    if (args[0].equals("-l")) {
      Print.printUncomplete(todoList);

    } else if (args[0].equals("-la")) {
      Print.print(todoList);
    }
  }
}
