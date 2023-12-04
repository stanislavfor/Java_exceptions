package lesson_1.seminar;

// Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод?

import java.util.Arrays;

public class Task_9 {

    public static void main(String[] args) {

        // объявляем и инициализируем двумерный массив целых чисел
        int[][] oneArray = {{1}, {1, 2}, {1, 2, 3}};
        int[][] twoArray = {{2}, {3, 2}, {4, 5, 6}};
//        int[][] twoArray = {{2}, {3, 2}, {4, 5, 6}, {3, 6}};

        // Проверяем массивы на длину
        if (oneArray == null || twoArray == null || oneArray.length != twoArray.length) {
            System.out.println("эти массивы - не равной длины");
            System.out.println(Arrays.deepToString(oneArray));
            System.out.println(Arrays.deepToString(twoArray));
        } else {
            System.out.println("массивы по длине равны");
            System.out.println("массив 1 : ".toUpperCase());
            int res = 0;
            for (int i = 0; i < oneArray.length; i++) {
                for (int j = 0; j < oneArray[i].length; j++) {
                    System.out.print(oneArray[i][j] + " ");
                    res = i;
                }
            }
            System.out.printf("\nиндекс массива в двумерном массиве: %d; длина массива: %d%n", res, oneArray[res].length);
            System.out.println(" ");
            System.out.println("массив 2 : ".toUpperCase());
            for (int i = 0; i < twoArray.length; i++) {
                for (int j = 0; j < twoArray[i].length; j++) {
                    System.out.print(twoArray[i][j] + " ");
                    res = i;
                }
            }
            System.out.printf("\nиндекс массива в двумерном массиве: %d; длина массива: %d%n", res, twoArray[res].length);
        }

    }
}


