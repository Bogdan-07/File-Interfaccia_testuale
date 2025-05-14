import java.util.Scanner;

public class Menu {
    ManageFile manageFile;
    Scanner userInput;

    // Constructor

    public Menu() {
        manageFile = new ManageFile();
        userInput = new Scanner(System.in);
    }

    // Menu methods

    public void cli() {
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║      - View file list         ║");
        System.out.println("║      - Read file content      ║");
        System.out.println("║      - Delete file            ║");
        System.out.println("║      - Quit                   ║");
        System.out.println("╚═══════════════════════════════╝");
    }
    public boolean choiceHandler(String input) {
        input = input.toUpperCase();
        char choice = input.charAt(0);
        boolean x = true;

        switch (choice) {
            case 'V':
                String[] array = manageFile.viewFileList();
                String fileList = "";
                if ((array == null)) {
                    System.out.println("Error! Check today's log.");
                    Logger.log("Error while viewing list of files! Folder is empty.");
                } else
                    for(String string : array)
                        fileList += string + "\n";
                System.out.println(fileList);
                Logger.log("File list returned succesfully.");
                break;
            case 'R':
                System.out.print("Insert file name: ");
                String fileContent = manageFile.readFileContent(userInput.nextLine());
                if (fileContent == null) {
                    System.out.println("Error! Check today's log.");
                    Logger.log("Error while reading file content! A file with such name doesn't exist.");
                } else {
                    System.out.println("\nHere's the file content: \n" + fileContent);
                    Logger.log("File content was read successfully.");
                }
                break;
            case 'D':
                System.out.print("Insert file name: ");
                if (manageFile.deleteFile(userInput.nextLine())) {
                    System.out.println("File deleted.");
                    Logger.log("File was deleted successfully.");
                } else {
                    System.out.println("Error! Check today's log.");
                    Logger.log("Error while deleting file! A file with such name doesn't exist.");
                }
                break;
            case 'Q':
                x = false;
                Logger.log("User terminated process.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        return x;
    }
}