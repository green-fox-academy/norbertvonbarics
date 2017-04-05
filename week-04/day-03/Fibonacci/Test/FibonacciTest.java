import org.junit.Test;

import static org.junit.Assert.*;


public class FibonacciTest {
  Fibonacci test = new Fibonacci();

  @Test
  public void testFibonacci() throws Exception {
    int num;
    assertEquals(13, test.fibonacci(7));
  }
}