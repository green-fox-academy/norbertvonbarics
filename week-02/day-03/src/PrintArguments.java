
public class PrintArguments {
  public static void main(String[] args) {
    String input = "this is a string";
    System.out.println(printer(input));
  }
  public static String printer(String a){
    String[] parts = a.split("");
    return parts;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)