package lesson_3.seminar;

import java.io.IOException;

public class Main_3 {
        public static void main(String[] args) {
            try {
                doSomething();
            } catch (IOException e) {
                System.out.println("Обработка исключения: " + e.getMessage());
            }
        }

        public static void doSomething() throws IOException {

            throw new IOException("Ошибка ввода-вывода");
        }


}
