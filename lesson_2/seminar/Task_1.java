package lesson_2.seminar;

// Прочитайте название класса исключения, предположите о какой проблеме
// свидетельствует. Попробуйте предположить, к какому типу относятся следующие
// классы исключений checked, unchecked, error.
// Проверьте себя с помощью иерархии классов java:
// ● ClassCastException
// ● StackOverflowError
// ● IOError
// ● IOException
// ● NullPointerException
// ● ConcurrentModificationException
// ● IllegalArgumentException
// ● EOFException
// ● ClassNotFoundException
// ● ThreadDeath </aside>

public class Task_1 {

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        System.out.println(sum2d(arr));
        String[][] arr1 = {{"45", "23"}};
        System.out.println(sum2d(arr1));
        String[][] arr2 = {{"0", "2e"}, {"14", "5"}};
        System.out.println(sum2d(arr2));
        System.out.println(sum2d(null));
    }

    public static int sum2d(String[][] arr){
        if (arr == null){
            return -1;
        }
        else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) { // заменили 5 на arr[0].length
                    if (arr[i][j].matches("[0-9]+")) {
                        int val = Integer.parseInt(arr[i][j]);
                        sum += val;
                    }
//                    else{
//                        return -2;
//                    }
                }
            }
            return sum;
        }
    }
}
