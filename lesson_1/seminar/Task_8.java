package lesson_1.seminar;


import lesson_1.homework.Hw_4_original;

import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
// возвращающий новый массив, каждый элемент которого равен сумме элементов двух
// входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Task_8 {
    public int[] sumArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if(a == null || b == null || a.length != b.length){
            return new int[1]; // нулевой массив длины 1 будет означать различие в длине массивов
        }
        else {
            int[] c = new int[a.length];
            for(int i = 0; i < a.length; i++){
                c[i] = a[i] + b[i];
            }
            return c;
        }
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Task_8 ans = new Task_8();
        String itresume_res = Arrays.toString(ans.sumArrays(a, b));
        System.out.println(itresume_res);
    }


}
