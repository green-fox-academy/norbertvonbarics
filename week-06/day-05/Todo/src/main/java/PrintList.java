import java.util.ArrayList;
import java.util.List;

class PrintList {

  static void printList(String[] args) {
    List<Todo> todoList = ReadFile.readFiles();
    List<String> printedList = new ArrayList<>();
    if (args[0].equals("-la")) {
      for (int i = 0; i < todoList.size(); i++) {
        if (!todoList.get(i).checked) {
          printedList.add((i + 1) + " [ ] #ID:" + todoList.get(i).id + " " + todoList.get(i).todo);
        } else {
          printedList.add((i + 1) + " [X] #ID:" + todoList.get(i).id + " " + todoList.get(i).todo);
        }
      }
    } else if(args[0].equals("-l")) {
      for (int j = 0; j < todoList.size(); j++) {
        if (!todoList.get(j).checked) {
          printedList.add((j + 1) + "[ ] #ID:" + todoList.get(j).id + " " + todoList.get(j).todo);
        }
      }
    }
    for (String lines : printedList) {
      System.out.println(lines);
    }
  }
}
