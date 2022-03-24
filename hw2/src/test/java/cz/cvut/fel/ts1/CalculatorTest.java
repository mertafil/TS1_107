package cz.cvut.fel.ts1;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculatorTest 
{
    Calculator calculator;

    @Before
    public void calculatorSetUp()
    {
        calculator = new Calculator();
    }
    
    //region SimpleTests

    @Test
    public void add_AddNumbers_Equals13()
    {
        int excepted = 13;
        int result = calculator.add(7, 6);

        Assert.assertEquals(excepted, result);
    }

    @Test
    public void subtract_SubtractNumbers_Equals3()
    {
        int excepted = 3;
        int result = calculator.subtract(13, 10);

        Assert.assertEquals(excepted, result);
    }

    @Test
    public void multiply_MultiplyNumbers_Equals18() {
        int excepted = 18;
        int result = calculator.multiply(6, 3);

        Assert.assertEquals(excepted, result);
    }

    @Test
    public void divide_DivideNumbers_Equals7()
    {
        int excepted = 7;
        int result = calculator.divide(21, 3);

        Assert.assertEquals(excepted, result);
    }

    //endregion SimpleTests
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void divide_ThrowException_DivideByZeroException()
    {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");

        calculator.divide(7, 0);
    }
}
