package lesson_3.seminar;

import java.io.IOException;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main_5 implements AutoCloseable{
    private Integer count;
    //
    //    public static void main(String[] args){
    //        // add();
    //    }
    public static void main(String[] args) throws IOException {
        Main_5 m = new Main_5();
        m.add();
        System.out.println(m.getCount());
        m.add();
        m.add();
        System.out.println(m.getCount());
        m.close();
        m.add();
    }
    public Main_5(){
        this.count = 0;
    }

    public void add() throws IOException{
        checkClose();
        this.count++;
    }


    public Integer getCount() throws IOException{
        checkClose();
        return count;
    }


    public void checkClose() throws IOException{
        if (this.count == null)
            throw new IOException("Экземпляр закрыт!");
    }


    @Override
    public void close(){
        this.count = null;
    }
}



