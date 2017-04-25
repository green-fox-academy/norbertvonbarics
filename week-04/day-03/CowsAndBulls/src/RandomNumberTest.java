import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;



public class RandomNumberTest {

  @Test
  public void randomNumber() throws Exception {
    List<Integer> randomNumber = RandomNumber.randomNumber();
    assertEquals(4, randomNumber.size());
  }

}