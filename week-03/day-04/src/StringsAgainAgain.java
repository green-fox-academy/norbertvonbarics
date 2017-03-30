public class StringsAgainAgain {
  public static void main(String[] args) {
    String text = "asdgfaslfngqeolbn";
    int num = text.length();
    System.out.println(xToY(text, num));
  }

  public static String xToY(String text, int len) {
    if (text.length() == 0) {
      return text;
    }
    if (len % 2 == 0) {
      text = "*" + text.substring(1);
    }

    return text.charAt(0) + xToY(text.substring(1, text.length()),  len -1);

  }
}

// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
