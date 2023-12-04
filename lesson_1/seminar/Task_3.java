package lesson_1.seminar;

// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с
// квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
// только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Task_3 {
    public static void checkArray(int[][] matrix) {
        if (matrix == null) throw new RuntimeException("Пустой массив");
        else { int countRow = matrix.length; for (int i = 0; i < countRow; i++){
            if (countRow != matrix[i].length) throw new RuntimeException("Размеры массива не совпадают");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 || matrix[i][j] != 1) throw new RuntimeException("Элементы отличные от 0 и 1");
            }
        } int result = 0; for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j];
            }
        } System.out.println("Сумма элементов массива " + result);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = {{1, 2}, {2, 1}, {-1, -2}, {-2, 1}};
        int[][] matrix3 = {{1, 2}, {2, 1}, {-1, -2, 4, 5}, {-2, 1}};
        int[][] matrix2 = {{1, 0}, {0, 1}};
        //checkArray(matrix);
        // checkArray(matrix1);
        // checkArray(matrix2);
        // checkArray(matrix3);
         checkArray(null); }

}
