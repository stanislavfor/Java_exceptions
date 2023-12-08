package lesson_2.homework;

public class Expr_2 {

    static class Expr {
        public static double expr(int a, int b) {
            // Введите свое решение ниже
            // проверка, что делитель b не равен нулю
            double result;
            if (b != 0) {
                result = expr(a, b);
                return result;
            } else {
                System.out.println("Невозможно выполнить деление. Делитель равен нулю.");
//                result = 0;
//                return result;
            }
            return 0;
        }


        public static void printSum(int a, int b) {
            // Введите свое решение ниже
            int sum = a + b;
            System.out.println(sum);

        }
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

//    public static class Printer {
        public static void main(String[] args) {
            int a;
            int b;

            if (args.length == 0) {
                a = 12; // a = 90;
                b = 5; // Default values if no arguments are provided b = 3;
            } else {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }

            double result = Expr.expr(a, b);
            System.out.println(result);

    }



}
