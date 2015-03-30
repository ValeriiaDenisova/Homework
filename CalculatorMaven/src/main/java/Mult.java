
/**
 * Created by Валерия on 11.03.2015.
 */
class Mult implements Operation{
    String sign = "*";
    String info = "операция умножения";
    public Double perform(Double a, Double b)throws ArithmeticException{
        Double rez = a*b;
        if(rez.equals(Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Multiplication Of Two Max Numbers");
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
