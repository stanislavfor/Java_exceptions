package lesson_2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
// возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Hw_1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.println("\"дробное число – число, которое состоит из дробной части и целой части, например, число 3,14.\"");
            System.out.print("введите дробное число (типа float) : ");
            try{
                float digitalFload = Float.parseFloat(reader.readLine());
                System.out.printf("введенно дробное число %f : ", digitalFload);
                work = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("ошибка ввода : \"введите дробное число\"");
            }

        }
    }

}
