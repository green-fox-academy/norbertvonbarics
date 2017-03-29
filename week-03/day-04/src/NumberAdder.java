
public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(adder(4));
  }

  public static int adder(int num) {
    if (num == 0) {
      return 0;
    } else {
      System.out.println(num);
      return num + adder(num -1);
    }
  }
}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.