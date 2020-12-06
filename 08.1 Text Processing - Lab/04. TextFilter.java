import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : bannedWords) {
            if (text.contains(word)) {
                String replacement = repeatStr("*", word.length());
                text = text.replace(word, replacement);
            }
        }
        System.out.println(text);
    }

    private static String repeatStr(String str, int length) {
        String replacement = "";

        for (int i = 0; i < length; i++) {
            replacement += str;
        }
        return replacement;
    }
}
