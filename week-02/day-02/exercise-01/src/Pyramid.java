
public class Pyramid {
  public static void main(String[] args) {
    int number = 11;
    for (int i = 0; i < number; i++) {
      int spaceCount = (number - i);
      for(int j = 0; j< number; j++) {
        if(j < spaceCount || j >= (number - spaceCount)) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
