
/**
 * Created by Валерия on 11.03.2015.
 */
class Div implements Operation{
    String sign = "/";
    String info = "division operation";
    public Double perform(Double a, Double b) throws ArithmeticException{
        if(b.equals(0.0)){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }

    @Override
    public String getOperationSign() {return sign;}

    @Override
    public String getInfo() {return info;}
}
