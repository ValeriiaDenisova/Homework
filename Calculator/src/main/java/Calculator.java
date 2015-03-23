/**
 *
 */
public class Calculator {
    Operation[] arr = new Operation[4];

    Calculator() {
        arr[0] = new Plus();
        arr[1] = new Minus();
        arr[2] = new Mult();
        arr[3] = new Div();
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
