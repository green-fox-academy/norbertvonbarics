import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareLength {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};
    System.out.println(Arrays.toString(compare(p1, p2)));
  }

  public static int[] compare(int[] a, int[] b) {
    if (a.length > b.length) {
      return a;
    } else {
      return b;
    }
  }
}

// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`