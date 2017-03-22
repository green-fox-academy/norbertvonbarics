public class OverlinedBox {
  public static void main(String[] args) {
    int num = 6;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num -1; j++) {
        boolean b1 = (j == i) || (j == 0);
        boolean b2 = (j == 4) && ((i != 0) && (i != num -1));
        if ((i == 0) && (j == 0) || (i == num- 1) && (j == 0)) {
          System.out.print("%%%%%");
        } else if (b1 || ((b2))){
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