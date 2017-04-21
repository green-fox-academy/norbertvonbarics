import java.util.List;

public class Print {

  static void print(List todoList) {
    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(i + 1 + " - " + todoList.get(i));
    }
  }

  static void printUncomplete(List todoList) {
    for (int j = 0; j < todoList.size(); j++) {
      if (todoList.get(j).toString().substring(0, 3).equals("[ ]")) {
        System.out.println(todoList.get(j));
      }
    }
  }
}
