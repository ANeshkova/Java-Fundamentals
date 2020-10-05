import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> odds = new ArrayList<>();
        String[] words = scan.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordLowerCase = word.toLowerCase();

            if (counts.containsKey(wordLowerCase)) {
                counts.put(wordLowerCase, counts.get(wordLowerCase) + 1);
            } else {
                counts.put(wordLowerCase, 1);
            }
        }

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
