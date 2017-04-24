import java.util.ArrayList;
import java.util.List;

class AddTask {

  private static final String LINE = "=======================================\n";
  private static final String NOTASK = "Unable to add task: No task provided!\n";
  private static final String ADD = " added to ToDo list!";

  static void addTask(String[] args) {
    Todo userInput;
    List<Todo> todoList = ReadFile.readFiles();
    int newId =  todoList.get(todoList.size()-1).id + 1;
    if (args[0].equals("-a")) {
      if (args.length == 1) {
        System.out.println("\n" + LINE + NOTASK + LINE);
      } else {
        userInput = new Todo(false, newId, args[1]);
        todoList.add(userInput);
        System.out.println("\n" + "Task " + args[1] + ADD);
        WriteFile.writeToFile(todoList);
        PrintList.printList(args);
      }
    }
  }
}
