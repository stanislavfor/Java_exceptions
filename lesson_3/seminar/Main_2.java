package lesson_3.seminar;

import java.io.IOException;

public class Main_2 {
        public static void main(String[] args){
            try{
                doSomething();
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
        }

        public static void doSomething() throws IOException{
            System.out.println("Hello, world!");
        }

}
