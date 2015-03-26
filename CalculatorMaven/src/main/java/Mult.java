
/**
 * Created by Валерия on 11.03.2015.
 */
class Mult implements Operation{
    String sign = "*";
    String info = "операция умножения";
    public Double perform(Double a, Double b){
        return a*b;
    }

    @Override
    public String getOperationSign() {
        return sign;
    }

    @Override
    public String getInfo() {return info;}
}
