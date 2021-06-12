package l174031_assignment3;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class TestCalculator {
  @Test
  public void multiply() {
	  int expectedResult = 16;
	  int actual = Calculator.multiply(2, 8);
	  assertEquals(actual, expectedResult);
  }
}
