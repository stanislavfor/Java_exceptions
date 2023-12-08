package lesson_3.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class bookNoteJava {
    public static void main(String[] args) {

        try {

//      String input = " ";
//      Иванов Иван Иванович 23.01.1990 1234567890 m
//      Петров Иван Иванович 01.06.1990 1234567890 m
//      Иванов Семен Иванович 11.03.1980 1234567766 m
//      Петров Сергей Ильич 10.09.1960 9934567890 m
//      Иванов Иван Иванович 10.01.1980 1234567890 m
//      Петров Иван Иванович 01.12.1990 1234567890 m
//      Петров Сергей Ильич 10.09.1960 9934567890 m
//      Семенова София Ильинична 19.10.1962 9937767853 f


            // Получение входных данных от пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.print("введите данные 'Фамилия Имя Отчество ДатаРождения(dd.MM.yyyy) НомерТелефона Пол(m или f)' : ");
            String input = scanner.nextLine();

            // Разделение строки на отдельные значения
            String[] values = input.split(" ");

            // Проверка количества полученных значений
            if (values.length != 6) {
                throw new IllegalArgumentException("Неверный формат ввода данных");
            }

            // Преобразование значений к нужным типам
            String surname = values[0];
            String name = values[1];
            String patronymic = values[2];
            String dateOfBirth = values[3];
            String phoneNumber = values[4];
            char gender = values[5].charAt(0);

            // Проверка форматов данных
            if (!surname.matches("[а-яА-Я]+") || !name.matches("[а-яА-Я]+") || !patronymic.matches("[а-яА-Я]+")) {
                throw new IllegalArgumentException("Фамилия, имя и отчество должны состоять только из букв");
            }
            if (!phoneNumber.matches("[0-9]+")) {
                throw new IllegalArgumentException("Номер телефона должен состоять только из цифр");
            }
            if (gender != 'm' && gender != 'f') {
                throw new IllegalArgumentException("Неверное значение пола");
            }
            // Парсинг даты рождения
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate birthDate = LocalDate.parse(dateOfBirth, dtf);
            } catch (DateTimeParseException e) {
                System.out.println("\"некорректный формат даты рождения!\"");
                return;
            }


            // Создание файла с названием, равным фамилии
            File file = new File("lesson_3/homework/noteJava/" + surname + "_noteJ.txt");

            // Запись данных в строку
            String data = "<" +surname + "><" + name + "><"
                    + patronymic + "><" + dateOfBirth + "><"
                    + phoneNumber + "><" + gender + ">\n";

            // Запись данных в файл
            FileWriter writer = new FileWriter(file, true);
            writer.write(/*System.getProperty("line.separator") +*/ data);
            writer.close();


            // Вывод сообщения об успешном выполнении программы
            System.out.println("Данные успешно записаны в файл");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл");
        }

    }

}


