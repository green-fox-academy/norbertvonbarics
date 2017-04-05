import org.junit.Test;

import static org.junit.Assert.*;


public class AnagramTest {
  Anagram test = new Anagram();
  String userInput1 = "asdf";
  String userInput2 = "fdsa";
  @Test
  public void testAnagram() throws Exception {
    assertTrue(test.isAnagram(userInput1, userInput2));
  }
}