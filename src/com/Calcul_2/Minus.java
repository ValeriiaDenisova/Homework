package com.Calcul_2;

/**
 * Created by Валерия on 11.03.2015.
 */
public class Minus implements Operation{
    String sign = "-";
    String info = "операция вычитания";
    public Double perform(Double a, Double b){
        return a-b;
    }

    @Override
    public String getOperationSign() {
        return sign;
    }

    @Override
    public String getInfo() {return info;}
}
