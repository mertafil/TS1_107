package cz.cvut.fel.ts1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void Factorial_TestingFactorial_Return24() {
        App app = new App();
        int expectedValue = 24;
        int result = app.factorial(4);

        Assert.assertEquals(expectedValue, result);
    }

}
