import java.util.List;

class PrintList {

  static void printList(String[] args) {
    List<Todo> todoList = ReadFile.readFiles();
    if (args[0].equals("-la")) {
      for (int i = 0; i < todoList.size(); i++) {
        if (!todoList.get(i).checked) {
          System.out.println((i + 1) + " [ ] " + todoList.get(i).id + " " + todoList.get(i).todo);
        } else {
          System.out.println((i + 1) + " [X] " + todoList.get(i).id + " " + todoList.get(i).todo);
        }
      }
    }
  }
}
