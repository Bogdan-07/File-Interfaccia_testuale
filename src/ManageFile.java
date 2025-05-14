import java.io.File;
import java.util.Scanner;

public class ManageFile {

    // Constructor

    public ManageFile(){

    }

    // ManageFile methods

    public String[] viewFileList(){
        File folder = new File("./");
        if(folder.exists())
            return folder.list();
        else
            return null;
    }
    public String readFileContent(String fileName){
        File path = new File(fileName);
        if(!path.exists())
            return null;
        String fileContent = "";
        try{
            Scanner myReader = new Scanner(path);
            while (myReader.hasNextLine())
                fileContent += myReader.nextLine();
            myReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fileContent;
    }
    public boolean deleteFile(String fileName){
        File path = new File(fileName);
        return path.delete();
    }
}
