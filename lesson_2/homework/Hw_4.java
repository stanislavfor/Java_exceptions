package lesson_2.homework;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Hw_4 {
    public static void main(String[] args){
        notNullString();
    }

    public static void notNullString(){
        boolean isTrue = true;
        while (isTrue){
            Scanner scanner = new Scanner(System.in);
            System.out.print("\"введите строку\" : ");
            String scan = scanner.nextLine();
            if (scan != null && scan != "") {
                System.out.println("введена строка :  " + scan);
                isTrue = false;
            } else {
                taskException();
            }
        }
    }

    public static void taskException(){
        System.out.println("СООБЩЕНИЕ: \"пустые строки вводить нельзя\"");
    }
}
