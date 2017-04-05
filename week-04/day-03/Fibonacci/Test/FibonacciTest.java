import org.junit.Test;

import static org.junit.Assert.*;


public class FibonacciTest {
  Fibonacci test = new Fibonacci();

  @Test
  public void testFibonacci() throws Exception {
    int num;
    assertEquals(1, test.fibonacci(1));
    assertEquals(21, test.fibonacci(8));
  }
}