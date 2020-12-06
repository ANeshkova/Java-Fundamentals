import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] string = scan.nextLine().split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word : string) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                builder.append(word);
            }
        }
        System.out.println(builder);
    }
}
