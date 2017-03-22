public class OverlinedBox {
  public static void main(String[] args) {
    int num = 6;
    for (int i = 0; i < num; i++) {
     /* if ((i == 0) || (i == 5)) {
        System.out.print("%%%%%");
      }*/
      for (int j = 0; j < num -1; j++) {
        if ((i == 0) && (j == 0) || (i == 5) && (j == 0)) {
          System.out.print("%%%%%");
        } else if ((j == i) || (j == 0)) /*|| (j == 4)) */{
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %   %
// %%%%%
//
// The square should have as many lines as the number was