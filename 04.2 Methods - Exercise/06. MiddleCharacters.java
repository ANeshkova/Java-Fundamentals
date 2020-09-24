import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        printMiddleChar(text);
    }

    public static void printMiddleChar(String text) {
        if (text.length() % 2 == 0) {
            char firstSymbol = text.charAt(text.length() / 2 - 1);
            System.out.print(firstSymbol);
        }

        char secondSymbol = text.charAt(text.length() / 2);
        System.out.print(secondSymbol);
    }
}
