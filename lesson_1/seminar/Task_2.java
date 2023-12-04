package lesson_1.seminar;

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
// значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
// например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3
// 4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
// метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
// значение и покажет читаемый результат пользователю. Например, если вернулся -2,
// пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.Scanner;

public class Task_2 {
    public static int checkArray(int[] arr, int min, int number) {
        if (arr == null) return -3;
        else if (arr.length < min) return -1;
        else{ int count = 0, index = 0; for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){ count++; index = i;
            }
        } if (count == 1) return index; else if (count == 0) return -2; else return -4;
        }
    }
    public static void printResult(int number){
        if (number == -1) System.out.println("Длина массива не соответствует");
        else if (number == -2) System.out.println("Искомый элемент не найден");
        else if (number == -3) System.out.println("Пустой массив");
        else if (number == -4) System.out.println("Искомых элементов найдено несколько");
        else System.out.println("Индекс искомого элемента " + number);
    }
    public static void main(String[] args) {

//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите искомое число: ");
//         int num = in.nextInt();
         int[] array = {1, -2, 4, 5, 10};
         printResult(checkArray(array, 4, 5));
         int[] array1 = {1, -2, 4, 5, 10};
         printResult(checkArray(array1, 6, -2));
         int[] array2 = {};
         printResult(checkArray(array2, 2, 7));
         int[] array3 = {1, -2, 4, 5, 10, 4};
         printResult(checkArray(array3, 4, 4));
         int[] array4 = {1, -2, 4, 5, 10};
         printResult(checkArray(array4, 1, 8));
   }

}
