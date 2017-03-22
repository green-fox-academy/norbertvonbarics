
public class DiamondShape {
  public static void main(String[] args) {
    int number = 13;
    for (int i = 0; i < number + 2; i++) {
      if (i < number / 2 + 1) {
        for (int j = 0; j < number - i; j++) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (i * 2 - 1); k++) {
          System.out.print("*");
        }
      } else {
        for (int k = 1; k <= (i - 1); k++) {
          System.out.print(" ");
        }
        for (int j = 0; j < (number - i) * 2 + 1; j++) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was