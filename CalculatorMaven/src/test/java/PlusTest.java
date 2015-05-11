import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Валерия on 26.03.2015.
 */
public class PlusTest {
    @Test
    public void plusOfTwoNumbersTest(){
        //Arrange
        Plus plus = new Plus();

        //Act
        Double rez = plus.perform(5.0, 2.0);

        //Assert
        assertEquals("Plus is wrong", 7.0, rez, 1e-10);
    }

    @Test(expected = Exception.class)
    public void plusOfTwoMaxNumbersTest(){
        //Arrange
        Plus plus = new Plus();

        //Act
        plus.perform(1.7e+308, 1.7e+308);
    }
}
