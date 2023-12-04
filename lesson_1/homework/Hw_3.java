package lesson_1.homework;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
// возвращающий новый массив, каждый элемент которого равен разности элементов двух
// входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.ArrayList;
import java.util.Arrays;

public class Hw_3 {
    public static void main(String[] args) {
        int[] arrayOne = {9, 1, 2, 3, 4, 5};
        int[] arrayTwo = {5, 4, 3, 2, 1, 9};
//        int[] arrayTwo = {5, 4, 3, 2, 1, 9, 10};
        System.out.println("массив 1 : ".toUpperCase() + Arrays.toString(arrayOne));
        System.out.println("массив 2 : ".toUpperCase() + Arrays.toString(arrayTwo));
        System.out.println("разность элементов двух массивов : " + differenceArray(arrayOne, arrayTwo));
    }


    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("ошибка - один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("ошибка - массивы не равны по длине");
        }
        for (int i = 0; i < min; i++) {
            result.add(a1[i] - a2[i]);
        }
        return result;
    }


}
