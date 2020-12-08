import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(", ");
        List<String> racers = new ArrayList<>(Arrays.asList(data));

        LinkedHashMap<String, Integer> results = new LinkedHashMap<>();

        Pattern letterPattern = Pattern.compile("([A-Za-z])");
        Pattern digitPattern = Pattern.compile("([0-9])");

        String input = scan.nextLine();

        while (!"end of race".equals(input)) {
            Matcher nameMatcher = letterPattern.matcher(input);
            StringBuilder name = new StringBuilder();

            while (nameMatcher.find()) {
                name.append(nameMatcher.group(1));
            }

            if (racers.contains(name.toString())) {
                results.putIfAbsent(name.toString(), 0);
                int oldKm = results.get(name.toString());
                int newKm = 0;

                Matcher digitMatcher = digitPattern.matcher(input);

                while (digitMatcher.find()) {
                    newKm += Integer.parseInt(digitMatcher.group());
                }

                results.put(name.toString(), oldKm + newKm);
            }

            input = scan.nextLine();
        }

        int[] number = {1};
        results
                .entrySet()
                .stream()
                .sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r -> {
                    switch (number[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s", r.getKey()));
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s", r.getKey()));
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s", r.getKey()));
                            break;
                    }
                    number[0]++;
                });
    }
}
