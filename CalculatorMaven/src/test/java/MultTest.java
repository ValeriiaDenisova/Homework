import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Валерия on 26.03.2015.
 */
public class MultTest {
    @Test
    public void multiplicationOfTwoNumbersTest (){
        //Arrange
        Mult mult = new Mult();

        //Act
        Double rez = mult.perform(5.0, 2.0);

        //Assert
        assertEquals("Multiplication is wrong", 10.0, rez, 1e-10);
    }

    @Test(expected = ArithmeticException.class)
    public void multiplicationOfTwoMaxNumbersTest(){
        //Arrange
        Mult mult = new Mult();

        //Act
        mult.perform(1.7e+308, 1.7e+308);
    }
}
