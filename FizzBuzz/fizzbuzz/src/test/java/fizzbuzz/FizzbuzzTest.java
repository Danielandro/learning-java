package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzbuzzTest {
  @Test
  public void leavesNormalNumberAlone() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertEquals("1", fizzbuzz.converter(1));
  }
}