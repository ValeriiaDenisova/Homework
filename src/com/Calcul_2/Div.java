package com.Calcul_2;

/**
 * Created by Валерия on 11.03.2015.
 */
class Div implements Operation{
    String sign = "/";
    String info = "операция деления";
    public Double perform(Double a, Double b){
        return a/b;
    }

    @Override
    public String getOperationSign() {return sign;}

    @Override
    public String getInfo() {return info;}
}
