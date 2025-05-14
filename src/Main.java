import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Menu prova = new Menu();

        boolean x = true;

        while(x) {
            prova.cli();
            x = prova.choiceHandler(userInput.nextLine());
        }
    }
}