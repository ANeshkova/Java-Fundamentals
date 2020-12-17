import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int index = Integer.parseInt(tokens[1]);

            switch (command) {
                case "Shoot": {
                    int power = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index < targets.size()) {
                        int newValue = targets.get(index) - power;
                        targets.remove(index);

                        if (newValue > 0) {
                            targets.add(index, newValue);
                        }
                    }
                }
                break;

                case "Add": {
                    int value = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                }
                break;

                case "Strike": {
                    int radius = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index < targets.size()) {

                        int radiusLeft = index - radius;
                        int radiusRight = index + radius;
                        int targetsToRemove = 2 * radius + 1;

                        if (radiusLeft >= 0 && radiusRight < targets.size()) {

                            for (int i = 0; i < targetsToRemove; i++) {
                                targets.remove(radiusLeft);
                            }
                        } else {
                            System.out.println("Strike missed!");
                        }
                    }
                }
                break;
            }

            input = scan.nextLine();
        }

        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.println(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }
}
