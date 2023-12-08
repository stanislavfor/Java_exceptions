package lesson_3.seminar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input birth date in format dd.MM.yyyy : ");
        String birthDateStr = scanner.nextLine();
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate birthDate = LocalDate.parse(birthDateStr, dtf);
            System.out.println("Birth date: " + birthDate);
        } catch (DateTimeParseException e) {
            System.out.println("\"некорректный формат даты рождения!\"");
        }

    }
}
