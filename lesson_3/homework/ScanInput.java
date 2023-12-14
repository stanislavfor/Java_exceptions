package lesson_3.homework;


import java.util.Scanner;

public class ScanInput {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void inputEnter() {
        Scanner scanner = new Scanner(System.in);
        String input;


        try {
            System.out.println("запись контакта".toUpperCase() + " или введите 0 или * для выхода");
            System.out.print("введите 'Фамилия Имя Отчество ДатаРождения(dd.MM.yyyy) НомерТелефона(123) Пол(m или f)' : ");
            input = scanner.nextLine();


            if (input.equals("*") || input.equals("0")) {
                System.out.println(ANSI_CYAN + "программа завершена." + ANSI_RESET);
                System.exit(0);
            }


            // Разделение строки на отдельные значения
            String[] values = input.split(" ");

            // Проверка введенной строки
            NoteBook Notes = new NoteBook();
            Notes.NoteBookBox(values);

            // Выводим вариант ошибки из файлов проверки строки ввода
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "ошибка ввода данных: ".toUpperCase() + e.getMessage() + ANSI_RESET);
        }


    }


}
