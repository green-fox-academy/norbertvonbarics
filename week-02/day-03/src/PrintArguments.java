
public class PrintArguments {
  public static void main(String[] args) {
    String[] input = {"a", "b", "c", "d", "e"};
    System.out.println(printer(input));
  }

  private static String printer(String[] inputText) {
    String joinedText = "";
    for (String text : inputText) {
      joinedText += (text + " ");
    }
    return joinedText;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)