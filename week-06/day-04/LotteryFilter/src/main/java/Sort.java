import java.util.ArrayList;
import java.util.List;

class Sort {

  List<String[]> toSort(List<String[]> lines, int date) {
    List<String[]> sortedList = new ArrayList<String[]>();
    for (String[] line : lines) {
      if (line[0].equals(Integer.toString(date))) {
        sortedList.add(line);
      }
    }
    return sortedList;
  }
}
