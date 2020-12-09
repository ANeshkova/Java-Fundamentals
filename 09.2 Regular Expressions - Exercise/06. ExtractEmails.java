import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+)(@)([a-zA-Z]+([\\.\\-_][A-Za-z]+)+))(\\b|(?=\\s))";
        String line = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
