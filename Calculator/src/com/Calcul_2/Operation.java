package com.Calcul_2;

/**
 * Created by Валерия on 11.03.2015.
 */
public interface Operation {
    Double perform(Double a, Double b);
    String getOperationSign();
    String getInfo();
}
