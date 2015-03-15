package com.Calcul_2;

/**
 * Created by v.dmitrieva on 11.03.15.
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

    public Double perform(String z, Double a, Double b) {
        for (Operation anArr : arr) {
            if (z.equals(anArr.getOperationSign())) {
                return anArr.perform(a, b);
            }
        }

    }
}