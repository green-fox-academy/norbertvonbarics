import java.util.Scanner;

public class PalindromBuilder {
  public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);
    String input = newScanner.nextLine();
    String[] palBlock = input.split(" ");

    String reversed = "";
    for(int i = input.length()-1; i > -1; i--){
      reversed += input.charAt(i);
    }
    String palindrom = input.concat(reversed);
    System.out.println(palindrom);
  }
}
