import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int count = countOfVowels(input);
        System.out.println(count);
    }

    public static int countOfVowels(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            switch (letter) {
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
