
public class Emptybox {
  public static void main(String[] args) {
    int num = 6;
    for (int i = 0; i < num; i++) {
      String symbol = ((i == 0) || (i == num - 1)) ? "%%%%%" : "%   %";
      System.out.println(symbol);
    }
  }
}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was