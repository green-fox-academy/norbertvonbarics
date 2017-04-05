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
    letterMap.put("a",1);
    letterMap.put("s",1);
    letterMap.put("d",1);
    letterMap.put("f",1);

    assertEquals(letterMap, test.letterCounter(letters));
  }
}