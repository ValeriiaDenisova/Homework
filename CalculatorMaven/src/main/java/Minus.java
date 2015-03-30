import java.util.DoubleSummaryStatistics;

/**
 * Created by Валерия on 11.03.2015.
 */
public class Minus implements Operation{
    String sign = "-";
    String info = "операция вычитания";
    public Double perform(Double a, Double b)throws ArithmeticException{
        Double rez = a-b;
        if(rez.equals(Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Minus Of Two Minimal Numbers");
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
