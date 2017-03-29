
public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumDigit(234));
  }

  public static int sumDigit(int num) {
    if (num == 0) {
      return num;
    } else {
      return (num % 10) + (sumDigit(num / 10));
    }
  }
}

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).