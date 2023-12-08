package lesson_2.homework;

public class Hw_3_3 {

    // Главный класс Main для запуска программы
    public static class Main {
        public static void main(String[] args) {
            int a, b;
            if (args.length == 2) {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } else {
                a = 10; // значение по умолчанию
                b = 2; // значение по умолчанию
            }
            Expr expr = new Expr();
            Printer printer = new Printer();
            int result = expr.divide(a, b);
            printer.printSum(a, b);
            System.out.println("Результат деления: " + result);
        }

    }

    // Класс Expr для выполнения арифметической операции деления
    public static class Expr {
        public int divide(int a, int b) {
            if (b == 0) {
                System.out.println("Делитель равен нулю. Невозможно выполнить операцию.");
                return 0;
            } else {
                return a / b;
            }
        }
    }

    // Класс Printer для вывода суммы чисел a и b
    public static class Printer {
        public void printSum(int a, int b) {
            int sum = a + b;
            System.out.println("Сумма чисел a и b: " + sum);
        }
    }


}










