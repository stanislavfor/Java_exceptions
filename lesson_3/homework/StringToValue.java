package lesson_3.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToValue {

    public static boolean calculateIndexValue() {
        return true;
    }
    public void ValueStrings(String[] values){

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
            throw new IllegalArgumentException("номер телефона должен состоять только из цифр");
        }
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("неверное значение пола");
        }

        // Проверка и парсинг даты рождения
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate birthDate = LocalDate.parse(dateOfBirth, dtf);

        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("\"некорректный формат даты рождения\"");
        }

    }



}
