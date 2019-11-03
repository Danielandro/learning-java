package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class FizzbuzzTest {
  private Fizzbuzz fizzbuzz;

  @Before
  public void setupFizzbuzz() {
    fizzbuzz = new Fizzbuzz();
  }

  @Test
  public void leavesNormalNumberAlone() {
    assertEquals("1", fizzbuzz.converter(1));
    assertEquals("2", fizzbuzz.converter(2));
  }

  @Test
  public void returnsFizzIfMultipleOfThree() {
    assertEquals("Fizz", fizzbuzz.converter(3));
  }

  @Test
  public void returnsBuzzIfMultipleOfFive() {
    assertEquals("Buzz", fizzbuzz.converter(5));
  }

  @Test
  public void returnsFizzbuzzIfMultipleOfFifteen() {
    assertEquals("Fizzbuzz", fizzbuzz.converter(15));
  }
}
