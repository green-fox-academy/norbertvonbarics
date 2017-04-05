import java.util.ArrayList;
import java.util.Collections;

public class Sum {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println(numbers);
    System.out.println(sumMethod(numbers));
  }

  public static int sumMethod(ArrayList numbers) {
    if (numbers == null) {
      return 0;
    } else {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += (int) numbers.get(i);
      }
      return sum;
    }
  }
}
