
public class Fibonacci {
  public static void main(String[] args) {
    int num = 8;
    System.out.println(fibonacci(num-1));
  }

  public static int fibonacci(int num) {
    if (num == 0) {
      return 0;
    } else if ((num == 1)) {
      return 1;
    } else {
      int fibNum = fibonacci(num - 1) + fibonacci(num - 2);
      return fibNum;
    }
  }
}
