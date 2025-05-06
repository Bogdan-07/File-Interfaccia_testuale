import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Menu test = new Menu();

        boolean x = true;

        do
        {
            test.table();
            x = test.choiceHandler(scanner.nextLine());
        }while(x);
    }
}