package lesson_2.homework;

// Напишите программу, которая проверяет, является ли введенная текстовая строка числом
// с плавающей точкой (float).
// Программа пытается преобразовать введенную строку в число float,
// и если это успешно, она выводит полученное число.
// Если преобразование не удалось, программа выдаёт сообщение об ошибке и
// возвращает специальное значение Float.NaN, чтобы обозначить ошибку.
// На входе:
// '3.14'
//'Ivan'
// На выходе:
//3.14
public class Hw_1_original {
    class IsFloat {
        public static float isFloat(String input) {
            try {
                // Попробуйте преобразовать введенный текст в float
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                // Если не удалось преобразовать введенный текст в float, выведите сообщение об ошибке
                System.out.println("Your input is not a float number. Please, try again.");
                // Затем верните специальное значение, например, Float.NaN, чтобы обозначить ошибку
                return Float.NaN;
            }
        }
    }

//    public class Printer {
        public static void main(String[] args) {
            String input;

            if (args.length == 0) {
                input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
            } else {
                input = args[0];
            }

            float result = IsFloat.isFloat(input);
            System.out.println(result);
//        }
    }

}
