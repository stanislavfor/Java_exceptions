package lesson_1.homework;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных
//   массива, и возвращающий новый массив, каждый элемент которого равен
//   частному элементов двух входящих массивов в той же ячейке.
//   Если длины массивов не равны, необходимо как-то оповестить пользователя.
//   Важно: При выполнении метода единственное исключение,
//   которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.ArrayList;
import java.util.Arrays;

public class Hw_4 {
    public static void main(String[] args) {
        double[] arrayOne = {9, 8, 7, 3, 4, 5};
        double[] arrayTwo = {9, 4, 3, 2, 1, 5};
//        int[] arrayTwo = {5, 4, 3, 2, 1, 0};
        System.out.println("массив 1 : ".toUpperCase() + Arrays.toString(arrayOne));
        System.out.println("массив 2 : ".toUpperCase() + Arrays.toString(arrayTwo));
        System.out.println("Частное от деления двух массивов " + quotientOfArrays(arrayOne, arrayTwo));
    }


    public static ArrayList<Double> quotientOfArrays(double[] a1, double[] a2) {
        ArrayList<Double> result = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("ошибка - один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("ошибка - массивы не равны по длине");
        }
        for (int i = 0; i < min; i++) {
            if (a2[i] != 0) {
                result.add((double) (a1[i] / a2[i]));
            } else {
                throw new RuntimeException("ошибка - деление на ноль");
            }
        }
        return result;
    }

}

