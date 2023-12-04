package lesson_1.seminar;

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума,
// метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class Task_1 {
    public static void checkArray(int[] arr, int min) {
        if (arr.length < min) System.out.println(-1);
        else System.out.println(arr.length);
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        checkArray(array, 3);
        int[] array1 = {-10, 20, 30};
        checkArray(array1, 2); int[] array2 = {-10, 20, 30, -2};
        checkArray(array1, 5);
    }

}
