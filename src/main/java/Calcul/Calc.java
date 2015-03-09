package Calcul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;

/**
 * Created by Валерия on 09.03.2015.
 */
public class Calc {
    public void calcul(int a, String z, int b) {
        if (z.equals("+")) {
            System.out.println(a + "+" + b + "=" + sum(a, b));
        } else {
            if (z.equals("-")) {
                System.out.println(a + "-" + b + "=" + raz(a, b));
            } else {
                if (z.equals("*")) {
                    System.out.println(a + "*" + b + "=" + umn(a, b));
                } else {
                    if (z.equals("/")) {
                        System.out.println(a + "/" + b + "=" + del(a, b));
                    } else {
                        System.out.println("Вы ввели неверный знак");
                    }
                }
            }

        }
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double raz(double a, double b) {
        return a - b;
    }

    public double del(double a, double b) {
        return a / b;
    }

    public double umn(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Привет! Я калькулятор");
        System.out.println("Введи математический пример ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        if (aa.equals("exit")) {
            System.out.println("Конец");
        } else {
            int a = Integer.parseInt(aa);
            String z = reader.readLine();
            int b = Integer.parseInt(reader.readLine());

            Calc calc = new Calc();
            calc.calcul(a, z, b);
        }
    }
}
