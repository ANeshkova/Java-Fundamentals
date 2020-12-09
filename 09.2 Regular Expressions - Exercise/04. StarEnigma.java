import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> attack = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        int count = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile("([STARstar])");

        for (int i = 0; i < count; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            int counter = 0;

            while (matcher.find()) {
                counter++;
            }

            String decrypted = "";

            for (int j = 0; j < input.length(); j++) {
                char symbol = (char) (input.charAt(j) - counter);
                decrypted += symbol;
            }

            Pattern bigPattern = Pattern.compile
                    ("@(?<name>[A-Za-z]+)(?:[^@:!>\\-]*):(?<population>[\\d]+)(?:[^@:!>\\-]*)!(?<type>[AD])!(?:[^@:\\-!>]*)->(?<soldiers>\\d+)");
            Matcher match = bigPattern.matcher(decrypted);

            while (match.find()) {
                String type = match.group("type");

                if (type.equals("A")) {
                    attack.add(match.group("name"));
                } else {
                    destroyed.add(match.group("name"));
                }
            }
        }

        System.out.println(String.format("Attacked planets: %d", attack.size()));
        attack
                .stream()
                .sorted()
                .forEach(e -> {
                    System.out.println(String.format("-> %s", e));
                });

        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed
                .stream()
                .sorted()
                .forEach(e -> {
                    System.out.println(String.format("-> %s", e));
                });
    }
}
