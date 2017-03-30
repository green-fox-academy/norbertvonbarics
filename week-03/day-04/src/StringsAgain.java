public class StringsAgain {
  public static void main(String[] args) {
    char from = 'x';
    System.out.println(xToY("xxyyxyxxxxyyy"));
  }

  public static String xToY(String text) {
    if (!text.isEmpty()){
      return (text.substring(0, 1).equals("x") ? "" : text.substring(0, 1)) + xToY(text.substring(1));
    }else{
      return "";
    }
  }
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.

