import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Валерия on 26.03.2015.
 */
public class MinusTest {
    @Test
    public void MinusOfTwoNumbersTest() {
        //Arrange
        Minus min = new Minus();

        //Act
        Double rez = min.perform(5.0, 2.0);

        //Assert
        assertEquals("Minus is wrong", 3.0, rez, 1e-10);
    }

    @Test(expected = ArithmeticException.class)
    public void MinusOfTwoMinimalNumbersTest(){
        //Arrange
        Minus min = new Minus();

        //Act
        min.perform(-1.7e+308, 1.7e+308);
    }
}
