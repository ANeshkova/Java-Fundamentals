import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();

        while (!"end".equals(string)) {
            StringBuilder builder = new StringBuilder(string);

            builder.reverse();

            System.out.println(string + " = " + builder);
            string = scan.nextLine();
        }
    }
}
