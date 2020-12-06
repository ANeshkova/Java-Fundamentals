import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)) {
                digits.append(current);
            } else if (Character.isLetter(current)) {
                letters.append(current);
            } else {
                symbols.append(current);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
