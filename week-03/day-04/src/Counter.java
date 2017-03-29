
public class Counter {
  public static void main(String[] args) {
    count(5);
  }

  public static int count(int num) {
    if (num == 0) {
      return 1;
    } else {
      System.out.println(num);
      return count(num - 1);
    }
  }
}

// Write a recursive function that takes one parameter: n and counts down from n.