import java.util.ArrayList;
import java.util.List;

public class SplitString {
  List<String> splitString(String text, int index) {
    List<String> splittedText = new ArrayList<>();
    try{
      splittedText.add(text.substring(0, index));
      splittedText.add(text.substring(index, text.length()));
    }catch (StringIndexOutOfBoundsException ex) {
      ex.printStackTrace();
      System.out.println("SYNTAX ERROR 1");
    } catch (IndexOutOfBoundsException ex) {
      ex.printStackTrace();
      System.out.println("SYNTAX ERROR 2");
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println("SYNTAX ERROR 3");
    }

    return splittedText;
  }
}
