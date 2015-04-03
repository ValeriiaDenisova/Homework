import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
/**
 * Created by Валерия on 26.03.2015.
 */
public class CalculatorTest {
    Operation[] operations;

    @Before
    public void op(){
        operations = new Operation[4];
        operations[0] = mock(Plus.class);
        operations[1] = mock(Minus.class);
        operations[2] = mock(Mult.class);
        operations[3] = mock(Div.class);

        Mockito.when(operations[0].getOperationSign()).thenReturn("+");
        Mockito.when(operations[1].getOperationSign()).thenReturn("-");
        Mockito.when(operations[2].getOperationSign()).thenReturn("*");
        Mockito.when(operations[3].getOperationSign()).thenReturn("/");

        Mockito.when(operations[0].getOperationSign()).thenReturn("+");
        Mockito.when(operations[1].getOperationSign()).thenReturn("-");
        Mockito.when(operations[2].getOperationSign()).thenReturn("*");
        Mockito.when(operations[3].getOperationSign()).thenReturn("/");
    }

    @Test
    public void performCalculatorTest() throws WrongSingException {
        //Arrange
        Calculator calculators = mock(Calculator.class);

        //Act
        calculators.perform("+", 5.0, 2.0);
        calculators.perform("-", 5.0, 2.0);
        calculators.perform("*", 5.0, 2.0);
        calculators.perform("/", 5.0, 2.0);

        //Assert
        verify(calculators).perform("+", 5.0, 2.0);
        verify(calculators).perform("-", 5.0, 2.0);
        verify(calculators).perform("*", 5.0, 2.0);
        verify(calculators).perform("/", 5.0, 2.0);
    }

    @Test
    public void helpTest() {
        Calculator calculators = new Calculator(operations);

        String h = calculators.help();

        assertEquals("Help isn't work", "Calculator help \n+ : plus operation \n- : minus operation \n* : multiplication operation \n/ : division operation", h);
    }
}
