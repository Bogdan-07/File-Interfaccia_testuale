import java.time.LocalDate;
import java.io.FileWriter;

public class Logger{
    public static void log(String addToLog){
        try{
            FileWriter fileWriter = new FileWriter("log.txt" + LocalDate.now(),true);
            fileWriter.write(addToLog + "\n");
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}