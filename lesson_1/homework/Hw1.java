package lesson_1.homework;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
public class Hw1 {
    public static void main(String[] args) {
        divisionByZero();
        numberFormatException();
        arrayOutOfBoundsException();
    }


    // Метод ArithmeticException, указывающий об ощибке деления на 0
    public static void divisionByZero() {
        try {
            int digit = 20;
            int numZero = 0;
            int result = digit / numZero;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ошибка - деление на ноль невозможно");
        }
    }

    // Метод NumberFormatExceptionб указывающий об ошибке преобразования строки в число
    public static void numberFormatException() {
        try {
            String str = "abc";
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("ошибка - невозможно преобразовать строку в число");
        }
    }

    // Метод ArrayIndexOutOfBoundsException, указывающий об ошибке в размерности массива
    public static void arrayOutOfBoundsException() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ошибка - индекс находится вне границ массива");
        }
    }


}
