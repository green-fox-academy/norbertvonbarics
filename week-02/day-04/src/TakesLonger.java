import java.util.Arrays;

public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String[] splitMethod = quote.split(" ");
    String addedText = " " + "always takes longer than";
    String half1 = splitMethod[0].concat(" ").concat(splitMethod[1]).concat(" ").concat(splitMethod[2]).concat(addedText);
    String half2 = quote.substring(20);
    String finalString = half1 + half2;

    System.out.println(finalString);
  }
}

// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)