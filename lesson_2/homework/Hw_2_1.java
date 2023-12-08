package lesson_2.homework;

// Напишите программу, которая вычисляет значение выражения intArray[8] / d,
// гдеintArray- массив целых чисел, а d - делитель.
// Программа проверяет, имеется ли в массиве intArray элемент с индексом 8,
// и если нет, выводит сообщение о невозможности выполнения операции.
// Также программа проверяет, равен ли делитель d нулю, и если да,
// выводит соответствующее сообщение.
// На входе:
// '1 2 3 4 5 6 7 8 9'
// '1'
// На выходе:
// intArray[8] / d = 9 / 1 = 9.0
// 9.0

import java.util.Arrays;

public class Hw_2_1 {
    class Expr {
        public static double expr(int[] intArray, int d) {
            // Введите свое решение ниже
            if (intArray.length > 8) { // проверяем, есть ли элемент с индексом 8 в массиве
                if (d != 0) { // проверяем, что делитель не равен нулю
                    float result = intArray[8] / d;
                    System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + result);
                    return result;
                } else {
                    System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
                    return Float.NaN;
                }
            } else {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
                return Float.NaN;
            }

        }
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//    public class Printer {
        public static void main(String[] args) {
            int[] intArray;
            int d;
            if (args.length == 0) {
                intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                d = 1; // По умолчанию используем 0, если аргумент не передан
            } else {
                intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
                d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
            }
            double result = Expr.expr(intArray, d);
            System.out.println(result);
//        }
    }

}
