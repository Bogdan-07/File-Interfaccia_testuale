public class Menu
{
    private Logger logger;

    public Menu()
    {
        logger = new Logger();
    }

    public void table()
    {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║      - Read log file        ║");
        System.out.println("║      - Write log file       ║");
        System.out.println("║      - Delete log file      ║");
        System.out.println("║      - Quit                 ║");
        System.out.println("╚═════════════════════════════╝");
    }

    public boolean choiceHandler(String input)
    {
        input = input.toUpperCase();
        char choice = input.charAt(0);
        boolean quit = false;

        switch(choice)
        {

            case 'R':
                System.out.println(logger.readFile());
                break;
            case 'W':
                System.out.println("what do you want to write ");
                System.out.println(logger.writeFile());
                break;
            case 'D':
                if(logger.deleteFile())
                    System.out.println("Log file deleted successfully");
                else
                    System.out.println("Couldn't delete the log file");
                break;
            case 'Q':
                quit = true;
                break;
            default:
                System.out.println("Il carattere "+choice+" non è un opzione valida!");
        }
        return quit;
    }
}