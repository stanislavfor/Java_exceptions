package lesson_3.homework;

public class LengthForValue extends NoteBook {

    public static boolean calculateIndexLength() {
        return true;
    }

    public void ValuesLength(String[] values) {

        // Проверка количества полученных значений
        if (values.length != 6) {
            throw new IllegalArgumentException("неверный формат ввода данных");
        }



    }

}
