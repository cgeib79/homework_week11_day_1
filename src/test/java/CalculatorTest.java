import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

@Before
    public void before(){
    calculator = new Calculator(4, 2);
}

@Test
    public void add(){
    int add = calculator.add(4,2);
    assertEquals(6);
}

@Test
    public void subtract(){
    int subtract = calculator.subtract(4,2);
    assertEquals(2);
}

@Test
    public void multiply(){
    int multiply = calculator.multiply(4,2);
    assertEquals(8);
}

@Test
    public void divide(){
    int divide = calculator.divide(4, 2);
    assertEquals(2);
    }
}
