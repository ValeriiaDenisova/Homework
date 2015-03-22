package main.java;


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

<<<<<<< afb744608c1b482adc6b1b239a1511f4b95297ea:src/com/Calcul_2/Calculator.java
    public Double perform(String z, Double a, Double b) throws Exception {
=======
    public Double perform(String z, Double a, Double b) throws WrongSingException {
>>>>>>> c5b8ad33dfa0afb432707a281ba0df8a59a609d1:Calculator/src/com/Calcul_2/Calculator.java
            for (Operation anArr : arr) {
                if (z.equals(anArr.getOperationSign())) {
                    return anArr.perform(a, b);
                }
            }
<<<<<<< afb744608c1b482adc6b1b239a1511f4b95297ea:src/com/Calcul_2/Calculator.java
        throw new Exception();
=======
        throw new WrongSingException("Wrong sing!!!");
>>>>>>> c5b8ad33dfa0afb432707a281ba0df8a59a609d1:Calculator/src/com/Calcul_2/Calculator.java
    }
}




