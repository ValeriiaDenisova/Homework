
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CalculatorConsoleApp {
    public static void main(String[] args) throws Exception {
        Operation[] arr = new Operation[4];
        arr[0] = new Plus();
        arr[1] = new Minus();
        arr[2] = new Mult();
        arr[3] = new Div();
        Calculator calc = new Calculator(arr);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Привет! Я калькулятор");//Print greetings;
            String z = reader.readLine();
            if ("exit".equals(z)) break;
            if ("help".equals(z)) {
                String help = calc.help();
                System.out.println(help.toString());
                z = reader.readLine();
            }

            try {
                double a = Double.parseDouble(reader.readLine());
                double b = Double.parseDouble(reader.readLine());//Read values, perform operation, write it
                Double rez = calc.perform(z, a, b);
                System.out.println("rezult is " + rez.toString());
            } catch (NumberFormatException e1){
                System.out.println("Вы ввели бред. Введите цифры.");
            } catch (Exception e2){
                System.err.println(e2);
                String help = calc.help();
                System.out.println(help);
            }

        }while(true);
    }
}
