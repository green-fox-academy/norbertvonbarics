import java.util.ArrayList;
import java.util.List;

class AddTask {

  private static final String LINE = "=======================================\n";
  private static final String NOTASK = "Unable to add task: No task provided!\n";
  private static final String ADD = " added to ToDo list!";

  static void addTask(String[] args) {
    String userInput = "";
    List<String> todoList = ReadFile.readFiles();

    if (args[0].equals("-a")) {
      if (args.length == 1) {
        System.out.println("\n" + LINE + NOTASK + LINE);
      } else {
        Todo todo = new Todo(args[1], 5, false);
        userInput = todo.checked + "; "+ "#ID:" + todo.id + "; " + todo.todo;
        todoList.add(userInput);
        System.out.println("\n" + "Task " + ADD);
        WriteFile.writeToFile(todoList);
        PrintList.printList(args);
      }
    }
  }
}
