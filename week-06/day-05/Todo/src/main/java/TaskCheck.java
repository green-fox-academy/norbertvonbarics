import java.util.List;

class TaskCheck {

  private static final String LINE = "=======================================\n";
  private static final String UNABLETOCHECK = "Unable to check: index is out of bound!\n";

  static void taskCheck(String[] args) {
    List<Todo> todoList = ReadFile.readFiles();
    if (args[0].equals("-c")) {
      if (todoList.size() < Integer.parseInt(args[1])) {
        System.out.println("\n" + LINE + UNABLETOCHECK + LINE);
      } else {
        todoList.get(Integer.parseInt(args[1])-1).checked = true;
        WriteFile.writeToFile(todoList);
      }
      PrintList.printAll();
    }
  }
}
