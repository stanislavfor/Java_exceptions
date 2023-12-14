package lesson_3.homework;


public class NoteBook {

    public void NoteBookBox(String[] values){

        LengthForValue Val = new LengthForValue();
        Val.ValuesLength(values);

        StringToValue ValueString = new StringToValue();
        ValueString.ValueStrings(values);

        boolean indexValue = StringToValue.calculateIndexValue();
        boolean indexLength = LengthForValue.calculateIndexLength();


        WriterToFile FileWriter = new WriterToFile();
        FileWriter.InputWriter(values, indexValue, indexLength);

    }

}
