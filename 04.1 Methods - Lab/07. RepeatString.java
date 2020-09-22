import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int repeat = Integer.parseInt(scan.nextLine());
        System.out.println(printString(word, repeat));
    }

    private static String printString(String word, int repeat) {
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result += word;
        }
        return result;
    }
}
