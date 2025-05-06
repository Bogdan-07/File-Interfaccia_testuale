import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Logger
{
    private File file;
    private String data;


    public Logger()
    {
        file = new File("log.txt");
        data = "";
    }

    public String readFile()
    {
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                data += fileReader.nextLine();
            }
            fileReader.close();
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "An error occurred.";
        }
    }
    public String writeFile(String input)
    {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(input);
            fileWriter.close();
            return "Successfully wrote to the file.";
        } catch (IOException e) {
            e.printStackTrace();
            return "An error occurred.";
        }
    }
    public boolean deleteFile()
    {
        return file.delete();
    }
}