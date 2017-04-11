import java.util.Scanner;

public class CowsAndBulls {
  public static void main(String[] args) {

    checker(randomNumber(), myScanner());
  }

  public static void checker(String randomNumber, String userNumber) {
    for (int i = 0; i < 4;i++) {
      if ((int)randomNumber.charAt(i) == (int)userNumber.charAt(i)) {
        System.out.println("COW!!");
      } else if ((int)randomNumber.charAt(i) =)
    }
  }

  public static String myScanner() {
    Scanner myScanner = new Scanner(System.in);

    String userInput4Digit = "";
    for (int i = 4; i > 0; i--) {
      System.out.println("I need " + i + " digits!");
      int userInput = myScanner.nextInt();
      userInput4Digit += userInput;
    }
    System.out.println(userInput4Digit);
    return userInput4Digit;
  }

  public static String randomNumber() {
    //four digits
    int digit1 = (int) Math.floor(Math.random() * 10);
    int digit2 = (int) Math.floor(Math.random() * 10);
    int digit3 = (int) Math.floor(Math.random() * 10);
    int digit4 = (int) Math.floor(Math.random() * 10);

    StringBuilder sb = new StringBuilder();
    sb.append(digit1);
    sb.append(digit2);
    sb.append(digit3);
    sb.append(digit4);
    String fourDigitNumber = sb.toString();
    System.out.println(fourDigitNumber);
    return fourDigitNumber;
  }
}
