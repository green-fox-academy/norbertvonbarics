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
        userInput = "[ ] " + args[1];
        todoList.add(userInput);
        System.out.println("\n" + "Task " + userInput.substring(4) + ADD);
        WriteFile.writeToFile(todoList);
        Print.print(todoList);
      }
    }
  }
}
