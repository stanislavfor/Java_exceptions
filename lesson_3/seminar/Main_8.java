package lesson_3.seminar;

/*
    Задание №4
    1. Напишите метод,на вход которогоподаётся двумерный строковый массив
    размером 4х4. При подаче массива другого размера необходимо бросить
    исключение MyArraySizeException.
    2. Далееметод долженпройтисьпо всем элементам массива,преобразоватьв
    int и просуммировать. Если в каком-то элементе массива преобразование
    не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException с детализацией, в
    какой именно ячейкележат неверныеданные.
    3. В методе main() вызвать полученный метод, обработать возможные
    исключения MyArraySizeException и MyArrayDataException и вывести
    результатрасчета (сумму элементов,при условиичто подали на вход
    корректныймассив).
     */

    import java.io.*;

public class Main_8 {
    public static void main(String[] args) {
        //String[][] array = {{"1"}, {"2"}};
        //sumElementsFromArray(array);
        String[][] array1 = {{"1", "2", "3", "0"}, {"1", "2", "3", "0"}, {"1", "2", "3", "0"}, {"5", "6", "7", "8"}};
        System.out.println(sumElementsFromArray(array1));
        String[][] array2 = {{"1", "2", "3", "0"}, {"1MM", "2", "3", "0"}, {"1", "2", "3", "0"}, {"5", "6", "7", "8"}};
        sumElementsFromArray(array2);
    }

    public static int sumElementsFromArray(String[][] array){
        // int[][] array = {{{4, 5, 6}, {}, {}}, {4, 5, 5}, {6, 7, 8}};
        if (array.length != 4 && array[0].length != 4)
            throw new MyArraySizeException(array.length, array[0].length);
        int result = 0;
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                try{
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }

    static class MyArraySizeException extends RuntimeException {
        public MyArraySizeException(int row, int column){
            super("Массив должен быть 4х4, размеры Вашего массива -> " + row + " " + column);
        }
    }

    static class MyArrayDataException extends RuntimeException {
        public MyArrayDataException(int i, int j){
            super("Нельзя преобразовать значение, которое находится на позиции -> " + (i + 1) + " " + (j + 1));
        }
    }


}














