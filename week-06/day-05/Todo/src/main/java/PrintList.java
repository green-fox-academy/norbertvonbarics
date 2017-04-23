import java.util.List;

class PrintList {

  static void printList(String[] args) {
    List<String> todoList = ReadFile.readFiles();

    for (int i = 0; i < todoList.size(); i++) {
      for (int j = 0; j < todoList.size(); j++) {
        System.out.println(todoList.get(i));
      }
    }
  }
}
