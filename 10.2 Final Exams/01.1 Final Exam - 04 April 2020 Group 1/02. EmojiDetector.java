import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // String input = reader.readLine();

        List<String> threshold = new ArrayList<>();
        String input = scanner.nextLine();

        String regexDigits = "[\\s\\S]*?([0-9])";
        Pattern patternDigits = Pattern.compile(regexDigits);
        Matcher matcherDigits = patternDigits.matcher(input);
        int coolThreshold = 1;

        while (matcherDigits.find()) {
            int digit = Integer.parseInt(matcherDigits.group(1));
            coolThreshold *= digit;
        }

        String regexName = "(::|\\*\\*)([A-Z][a-z]{2,})(\\1)";
        Pattern patternName = Pattern.compile(regexName);
        Matcher matcherName = patternName.matcher(input);

        while (matcherName.find()) {
            String name = matcherName.group(1) + matcherName.group(2) + matcherName.group(3);
            threshold.add(name);
        }

        System.out.println(String.format("Cool threshold: %d", coolThreshold));
        System.out.println(threshold.size() + " emojis found in the text. The cool ones are:");

        for (String element : threshold) {
            int sum = 0;

            for (int i = 2; i < element.length() - 2; i++) {
                sum += element.charAt(i);
            }

            if (sum >= coolThreshold) {
                System.out.println(element);
            }
        }
    }
}
