package lesson_3.seminar;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main_4 {
        public static void main(String[] args){
            try{
                doSomething();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        public static void doSomething() throws IOException{
            String path = "C:\\Users\\den_m\\IdeaProjects\\Main_project\\src\\2.txt";
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String firstRow = reader.readLine();
            String SecondRow = reader.readLine();
            System.out.println(SecondRow);
        }



}
