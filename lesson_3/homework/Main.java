package lesson_3.homework;

import java.util.Scanner;

//      Иванов Иван Иванович 23.01.1990 1234567890 m
//      Петров Иван Иванович 01.06.1990 1234567890 m
//      Иванов Семен Иванович 11.03.1980 1234567766 m
//      Петров Сергей Ильич 10.09.1960 9934567890 m
//      Иванов Иван Иванович 10.01.1980 1234567890 m
//      Петров Иван Иванович 01.12.1990 1234567890 m
//      Петров Сергей Ильич 10.09.1960 9934567890 m
//      Серинова Ангелина Николаевна 02.07.1980 7755347890 f
// (false) Семенова София Ильинична 1962-10-02 tel7767853 f
// (false) Семенова София Ильинична 1962-10-02 9937767853 f
// Семенова София Ильинична 19.10.2002 9937767853 f

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("введите данные 'Фамилия Имя Отчество ДатаРождения(dd.MM.yyyy) НомерТелефона(123) Пол(m или f)' : ");
            String input = scanner.nextLine();
            // Разделение строки на отдельные значения
            String[] values = input.split(" ");

            // Проверка введенной строки
            NoteBook Notes = new NoteBook();
            Notes.NoteBookBox(values);

        // Выводим вариант ошибки из файлов проверки строки ввода
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка ввода данных: ".toUpperCase() + e.getMessage());
        }

    }



}
