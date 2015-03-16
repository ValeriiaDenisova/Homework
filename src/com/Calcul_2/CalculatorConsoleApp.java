package com.Calcul_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CalculatorConsoleApp {
    public static void main(String[] args) throws IOException, UncorrectSingException {
        Calculator calc = new Calculator();
        do {
            System.out.println("Привет! Я калькулятор");//Print greetings;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String z = reader.readLine();
            if ("exit".equals(z)) break;
            if ("help".equals(z)) {
                calc.help();
                z = reader.readLine();
            }
            double a = Double.parseDouble(reader.readLine());
            double b = Double.parseDouble(reader.readLine());//Read values, perform operation, write it
            calc.perform(z, a, b);
        }while(true);
    }
}
