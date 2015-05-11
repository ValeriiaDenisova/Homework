import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Валерия on 26.03.2015.
 */
public class DivTest {
    @Test
    public void divisionOfTwoNumbersTest(){
        //Arrange
        Div d = new Div();
        
        //Act
        Double rez = d.perform(5.0, 2.0);

        //Assert
        assertEquals("Division is wrong", 2.5, rez, 1e-10);
    }

    @Test(expected = ArithmeticException .class)
    public void divisionByZeroThrowExceptionTest () throws ArithmeticException  {
        //Arrange
        Div d = new Div();

        //Act
        d.perform(2.0, 0.0);
    }

}
