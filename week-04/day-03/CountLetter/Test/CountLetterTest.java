import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLetterTest {
  CountLetter test = new CountLetter();
  @Test
  public void testLetterCounter() throws Exception {
    String letters = "asdf";
    Map <String, Integer> letterMap = new HashMap<>();
    letterMap.put("a",0);
    letterMap.put("s",1);
    letterMap.put("d",2);
    letterMap.put("f",3);

    assertEquals(letterMap, test.letterCounter(letters));
  }
}