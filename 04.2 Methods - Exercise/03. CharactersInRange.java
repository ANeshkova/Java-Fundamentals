import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char last = scan.nextLine().charAt(0);

        if (first > last) {
            printSymbols(last, first);
        } else {
            printSymbols(first, last);
        }
    }

    public static void printSymbols(char start, char end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(String.format("%c ", i));

        }
    }
}
