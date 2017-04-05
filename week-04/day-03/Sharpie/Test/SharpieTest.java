import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
  Sharpie test = new Sharpie();
  @Test
  public void testGetInkAmount() throws Exception {
    assertEquals(100, test.getInkAmount(), 0.002);
  }

  @Test
  public void testUse() throws Exception {
    test.use();
    assertEquals(99, test.getInkAmount(), 0.002);
  }
}