public class OverlinedBox {
  public static void main(String[] args) {
    int num = 8;
    for(int i = 0; i < num; i++){
      if((i == 0) || (i == num -1)){
        System.out.println("%%%%%");
      } else {
        for(int j = 1; j < num -1; j++){

        }
      }
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