import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type in the expression! Start with and operator, and then type two number!");
    String operator = myScanner.next();
    System.out.println("Type the first number...");
    int number1 = myScanner.nextInt();
    System.out.println("...and the second!");
    int number2 = myScanner.nextInt();
    String equation = number1 + operator + number2 + " = ";
    if (operator.equals("+")) {
      System.out.println(equation +  (number1 + number2));
    } else if (operator.equals("-")) {
      System.out.println(equation +  (number1 - number2));
    } else if (operator.equals("/")) {
      System.out.println(equation +  (number1 / number2));
    } else if (operator.equals("*")) {
      System.out.println(equation +  (number1 * number2));
    }
  }
}

// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit