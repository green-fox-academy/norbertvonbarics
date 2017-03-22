
public class PrintArguments {
  public static void main(String[] args) {
    String[] input = {"a", "b", "c", "d", "e"};
    System.out.println(printer(input));
  }

  public static String printer(String[] a) {
    String x = "";
    for (int i = 0; i < a.length; i++) {
      x += (a[i] + " ");
    }
    return x;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)