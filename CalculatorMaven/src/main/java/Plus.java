
/**
 * Created by Валерия on 11.03.2015.
 */
public class Plus implements Operation {
    String sign = "+";
    String info = "операция прибавления";
    public Double perform(Double a, Double b)throws ArithmeticException{
        Double rez = a+b;
        if(rez.equals(Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Plus Of Two Max Numbers");
        }
        return rez;
    }

    @Override
    public String getOperationSign() {
        return sign;
    }

    @Override
    public String getInfo() {return info;}
}
