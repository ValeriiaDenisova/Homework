/**
 * Created by Валерия on 02.04.2015.
 */
public class CalcFactory {
    public static Operation[] calcSimple(){
        Operation[] arr = new Operation[4];
        arr[0] = new Plus();
        arr[1] = new Minus();
        arr[2] = new Mult();
        arr[3] = new Div();
        return arr;
    }
}
