package lesson_2.homework;

// Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
// если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
// "Пустая строка введена.".
// В противном случае программа должна возвращать сообщение
// "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.
// На входе:
// '0'
// На выходе:
// Result: Your input was - 0

public class Hw_4_original {
    class Expr {
        public static String expr(char a) throws Exception {
// Введите свое решение ниже
            String rusult = String.valueOf(' ');
            if (a != ' ') {
                String String = "Your input was - " + a;
                return String;
            } else {
                throw new IllegalArgumentException("Empty string has been input.");
            }
        }
    }
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

//    public class Printer {
        public static void main(String[] args) {
            char a;

            if (args.length == 0) {
                a = 'J'; // Значение по умолчанию, если аргументы не были предоставлены
            } else {
                a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
            }

            try {
                String result = Expr.expr(a);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
//    }


}
