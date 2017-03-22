import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("how many chicken has the farmer?");
    int userInput1 = scanner.nextInt();
    System.out.println("how many pig has the farmer?");
    int userInput2 = scanner.nextInt();
    System.out.println(userInput1 * 2 + userInput2 * 4);
  }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The seconf represents the number of pigs the farmer has
// It should print how many legs all the animals have