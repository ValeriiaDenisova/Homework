
/**
 * Created by Валерия on 11.03.2015.
 */
public class Plus implements Operation {
    String sign = "+";
    String info = "операция прибавления";
    public Double perform(Double a, Double b){
        return a+b;
    }

    @Override
    public String getOperationSign() {
        return sign;
    }

    @Override
    public String getInfo() {return info;}
}
