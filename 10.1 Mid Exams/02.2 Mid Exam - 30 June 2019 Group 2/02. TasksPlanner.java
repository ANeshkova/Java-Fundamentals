import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TasksPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> ints = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Complete": {
                    int index = Integer.parseInt(tokens[1]);
                    if (isIndexValid(ints, index)) {
                        ints.set(index, 0);
                    }
                }
                break;
                case "Change": {
                    int index = Integer.parseInt(tokens[1]);
                    int time = Integer.parseInt(tokens[2]);
                    if (isIndexValid(ints, index)) {
                        ints.set(index, time);
                    }
                }
                break;
                case "Drop": {
                    int index = Integer.parseInt(tokens[1]);
                    if (isIndexValid(ints, index)) {
                        ints.set(index, -1);
                    }
                }
                break;
                case "Count": {
                    String subCommand = tokens[1];
                    switch (subCommand) {
                        case "Completed": {
                            System.out.println(ints.stream().filter(value -> value == 0).count());
                        }
                        break;
                        case "Incomplete": {
                            System.out.println(ints.stream().filter(value -> value > 0).count());
                        }
                        break;
                        case "Dropped": {
                            System.out.println(ints.stream().filter(value -> value < 0).count());
                        }
                        break;
                    }
                }
            }

            input = scan.nextLine();
        }

        System.out.println(String.join(" ",
                ints.stream().filter(integer -> integer > 0).
                        collect(Collectors.toList()).toString().
                        replaceAll("[\\[\\],]", "")));
    }

    private static boolean isIndexValid(List<Integer> ints, int index) {
        return index >= 0 && index < ints.size();
    }
}
