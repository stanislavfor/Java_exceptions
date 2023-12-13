package lesson_3.homework;

import java.io.FileWriter;
import java.io.IOException;


public class WriterToFile extends NoteBook {

    public void InputWriter(String[] values, boolean indexValue, boolean indexLength){
        StringToValue StringToValue = new StringToValue();

        if (indexValue && indexLength) {
            try {
                FileWriter writer;
                String data;

                try {

                    // Запись данных в строку
                    data = "<" + values[0] + "><" + values[1] + "><"
                            + values[2] + "><" + values[3] + "><"
                            + values[4] + "><" + values[5] + ">\n";

                    // Запись данных в файл
                    writer = new FileWriter("lesson_3/homework/noteFile/" + values[0] + "_note.txt", true);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                writer.write(data); // <- запись строки data в файл surname_note.txt
                writer.close();
                System.out.println("значение успешно записано в файл");
            } catch (IOException e) {
                System.out.println("ошибка при записи в файл");
            }
        }
    }



}
