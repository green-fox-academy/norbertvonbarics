import java.util.Scanner;

public class PalindromSearcher {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();

    String reversed = "";
    for(int i = input.length()-1; i > -1; i--){
      reversed += input.charAt(i);
    }
    String palindrom = input.concat(reversed);
    System.out.println(palindrom);
  }
}
