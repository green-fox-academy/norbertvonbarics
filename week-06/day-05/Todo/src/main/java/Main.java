import java.util.List;

public class Main {

  private static final String DATAPATH = "./assets/data.csv";
  private static final String LINE = "=======================================\n";
  private static final String UNABLETOCHECK = "Unable to check: index is out of bound!\n";
  private static final String UNABLETOREMOVE = "Unable to remove: no index provided!\n";
  private static final String NOTASK = "Unable to add task: No task provided!\n";
  private static final String ADD = " added to ToDo list!";
  private static final String REMOVED = " removed from ToDo list!";
  private static final String UNSUPPORTED = "Unsupported argument!\n";

  public static void main(String[] args) {
    String userInput = "";
    List<String> todoList = ReadFile.readFiles();

    if (args.length == 0) {
      Ascii logo = new Ascii();
      logo.printAscii();
      logo.printUsage();

    } else if (args[0].equals("-l")) {
      Print.printUncomplete(todoList);

    } else if (args[0].equals("-la")) {
      Print.print(todoList);

    } else if (args[0].equals("-a")) {
      if (args.length == 1) {
        lineBreak();
        System.out.println(LINE + NOTASK + LINE);

      } else {
        userInput = "[ ] " + args[1];
        todoList.add(userInput);
        lineBreak();
        System.out.println("Task " + userInput.substring(4) + ADD);
        WriteFile.writeToFile(todoList);
        Print.print(todoList);
      }

    } else if (args[0].equals("-r")) {
      if (args.length == 1) {
        lineBreak();
        System.out.println(LINE + UNABLETOREMOVE + LINE);
      } else {
        String remove = todoList.get(Integer.parseInt(args[1]) - 1).substring(4);
        todoList.remove(Integer.parseInt(args[1]) - 1);
        lineBreak();
        System.out.println("Task " + remove + REMOVED);
        WriteFile.writeToFile(todoList);
        Print.print(todoList);
      }
    } else if (args[0].equals("-c")) {
      if (todoList.size() < Integer.parseInt(args[1])) {
        lineBreak();
        System.out.println(LINE + UNABLETOCHECK + LINE);

      } else {
        String tempTask = todoList.get(Integer.parseInt(args[1]) - 1).substring(3);
        int tempInt = Integer.parseInt(args[1]) - 1;
        todoList.set(tempInt, "[X]" + tempTask);
        lineBreak();
        WriteFile.writeToFile(todoList);
      }
      Print.print(todoList);

    } else {
      Ascii logo = new Ascii();
      lineBreak();
      System.out.println(LINE + UNSUPPORTED + LINE);
      lineBreak();
      logo.printUsage();
    }
  }

  private static void lineBreak() {
    System.out.println("");
  }
}

