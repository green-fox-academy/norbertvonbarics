
public class SumAll {
  public static void main(String[] args) {
    int num1 = 5;
    System.out.println(sum(num1));
  }

  public static int sum(int a) {
    int x = 0;
    if (a == 1) {
      x = 1;
    } else if (a > 1) {
      for (int i = 0; i < a; i++) {
        x += i;
      }
    }
    return x;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter
