import java.util.Scanner;


// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

public class SumAndAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please add 5 number in a row!");
    int userInput1 = scanner.nextInt();
    System.out.println("4 more to go");
    int userInput2 = scanner.nextInt();
    System.out.println("yepp 3 more");
    int userInput3 = scanner.nextInt();
    System.out.println("just 2 more");
    int userInput4 = scanner.nextInt();
    System.out.println("annnndd 1111!");
    int userInput5 = scanner.nextInt();

    int sumUserInputs = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
    System.out.println("The sum of your numbers is " + sumUserInputs + "!");
  }
}
