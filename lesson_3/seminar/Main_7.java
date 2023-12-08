package lesson_3.seminar;

/*
    Задание №3
    1. Создайте класс исключения, который будет выбрасываться при делении на 0.
     Исключениедолжно отображать понятноедля пользователя сообщение об ошибке.
    2. Создайте класс исключений, которое будет возникать при обращении к
    пустому элементу в массиве ссылочного типа. Исключение должно
    отображать понятное для пользователя сообщение об ошибке
    3. Создайте  класс исключения, которое будет возникать при попытке открыть
    несуществующий файл. Исключение должно отображать понятное для
    пользователя сообщение об ошибке.
     */

import java.io.FileNotFoundException;
import java.io.*;
public class Main_7 {


    public static class Main{ }

    static class DivByZero extends ArithmeticException{
        public DivByZero(){
            super("Деление на 0 запрещено ");
        }
    }

    static class NullPointerArray extends NullPointerException{
        public NullPointerArray(int index){
            super("Обращение к пустому элементу массива запрещено, индекс элемента: " + index);
        }
    }

    static class NotFile extends FileNotFoundException {
        public  NotFile(String path){
            super("Открыть  несуществующий файл нельзя, путь к файлу -> " + path);
        }
    }


}
