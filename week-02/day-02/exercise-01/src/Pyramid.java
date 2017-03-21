
public class Pyramid {
  public static void main(String[] args) {
    int number = 5;
    for(int i = 0; i < number +1;i++){
      for(int j = 0; j < number+1 -i; j++){
        System.out.print(" ");
      }
      for(int k = 0; k <= i; k++){
        System.out.print("* ");
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
