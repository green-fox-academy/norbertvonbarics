import java.util.Scanner;
public class TwoNumberGirls {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("number of girls?");
    int userInput1 = scanner.nextInt();
    System.out.println("number of boys?");
    int userInput2 = scanner.nextInt();
    if(userInput1 == userInput2) {
      System.out.println("the party is excellent!");
    } else if (userInput1 + userInput2 > 20){
      System.out.println("Quite cool party!");
    } else if {
      
    }
  }
}

// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
