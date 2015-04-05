
/**
 *
 */
public class Calculator {
    Operation[] arr;

    Calculator(Operation[] arr) {
        this.arr = arr;
    }

    public String help() {
        String helpInfo = "Calculator help \n";
        for (Operation op : arr) {
            helpInfo += op.getOperationSign() + " : " + op.getInfo() + " \n";
        }
        return helpInfo;
    }

    public Double perform (String z, Double a, Double b) throws WrongSingException {
        for (Operation anArr : arr) {
            if (z.equals(anArr.getOperationSign())) {
                return anArr.perform(a, b);
            }
        }
        throw new WrongSingException("Wrong sing!!!");
    }
}




