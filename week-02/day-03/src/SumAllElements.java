
public class SumAllElements {
  public static void main(String[] args) {
    int[] ai = {3, 4, 5, 6, 7};
    int count = 0;
    for (int number : ai) {
      count += number;
    }
    System.out.println(count);
  }
}

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`