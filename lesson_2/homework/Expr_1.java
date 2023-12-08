package lesson_2.homework;

class Expr_1 {
    public static void main(String[] args) {
        int a = 10; // значение по умолчанию для a
        int b = 5; // значение по умолчанию для b

// проверка, что делитель b не равен нулю
        if (b != 0) {
            double result = expr(a, b);
            System.out.println(result);
            printSum(a, b);
        } else {
            System.out.println("Невозможно выполнить деление. Делитель равен нулю.");
            System.out.println("0");
        }
    }

    public static double expr(int a, int b) {
        return (double) a / b;
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}