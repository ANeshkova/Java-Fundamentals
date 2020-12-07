import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            int newLetter = text.charAt(i) + 3;
            System.out.print(Character.toChars(newLetter));
        }
    }
}
