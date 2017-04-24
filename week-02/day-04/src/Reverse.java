public class Reverse {

  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverseString(reversed));
  }

  static String reverseString(String text) {
    String reversed = "";
    for (int i = text.length() - 1; i > -1; i--) {
      reversed += text.charAt(i);
    }
    text = reversed;
    return text;
  }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.