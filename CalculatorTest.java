/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
      @Test
      public void testEvaluate() {
	    Calculator calculator = new Calculator();
	    int sum = calculator.evaluate("1+2+3");
	    assertEquals(6, sum);
      }
}
