package com.Calcul_2;

/**
 * Created by v.dmitrieva on 16.03.15.
 */
class UncorrectSingException extends Exception {
    public String getMessage() {
        return "Введен неверный математический символ";
    }
}
