import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
  @Test
  void name() {
    Apples testApples = new Apples("alma");
    assertEquals("alma", testApples.getName());
  }
}