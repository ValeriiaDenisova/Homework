import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
/**
 * Created by Валерия on 26.03.2015.
 */
public class CalculatorTest {
    @Test
    public void getOperationSignTest () throws WrongSingException {
        Operation[] operations = new Operation[4];
        operations[0] = mock(Plus.class);
        operations[1] = mock(Minus.class);
        operations[2] = mock(Mult.class);
        operations[3] = mock(Div.class);
        Mockito.when(operations[0].getOperationSign()).thenReturn("+");
        Mockito.when(operations[1].getOperationSign()).thenReturn("-");
        Mockito.when(operations[2].getOperationSign()).thenReturn("*");
        Mockito.when(operations[3].getOperationSign()).thenReturn("/");
    }

    @Test
    public void getInfoTest(){
        Operation[] operations = new Operation[4];
        operations[0] = mock(Plus.class);
        operations[1] = mock(Minus.class);
        operations[2] = mock(Mult.class);
        operations[3] = mock(Div.class);
        Mockito.when(operations[0].getInfo()).thenReturn("операция прибавления");
        Mockito.when(operations[1].getInfo()).thenReturn("операция вычитания");
        //Mockito.when(operations[0].getInfo()).thenReturn("операция умножения");
        // Mockito.when(operations[1].getInfo()).thenReturn("операция деления");
    }

    @Test
    public void performCalculatorTest() throws WrongSingException {
        Calculator calculators = mock(Calculator.class);
        Operation[] arr = new Operation[4];
        arr[0] = new Plus();
        arr[1] = new Minus();
        arr[2] = new Mult();
        arr[3] = new Div();
        Mockito.when(calculators.perform("+", 5.0, 2.0)).thenReturn(7.0);
        assertEquals("Plus is wrong", 7.0, calculators.perform("+", 5.0, 2.0), 1e-10);
        Mockito.when(calculators.perform("-", 5.0, 2.0)).thenReturn(3.0);
        assertEquals("Minus is wrong", 3.0, calculators.perform("-", 5.0, 2.0), 1e-10);
        Mockito.when(calculators.perform("*", 5.0, 2.0)).thenReturn(10.0);
        Mockito.when(calculators.perform("/", 5.0, 2.0)).thenReturn(2.5);
    }


}
