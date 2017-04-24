import java.util.List;

class TaskRemove {

  private static final String LINE = "=======================================\n";
  private static final String UNABLETOREMOVE = "Unable to remove: no index provided!\n";
  private static final String REMOVED = " removed from ToDo list!";

  static void taskRemove(String[] args) {
    List<Todo> todoList = ReadFile.readFiles();
    if (args[0].equals("-r")) {
      if (args.length == 1) {
        System.out.println("\n" + LINE + UNABLETOREMOVE + LINE);
      } else {
        Todo remove = todoList.get(Integer.parseInt(args[1]) - 1);
        todoList.remove(Integer.parseInt(args[1]) - 1);
        System.out.println("\n" + "Task " + remove + REMOVED);
        WriteFile.writeToFile(todoList);
        PrintList.printAll();
      }
    }
  }
}
