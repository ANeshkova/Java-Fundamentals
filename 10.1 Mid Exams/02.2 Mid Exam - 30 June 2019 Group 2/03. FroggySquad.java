import java.util.*;
import java.util.stream.Collectors;

public class FroggySquad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> frogs = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        while (true) {
            String[] tokens = scan.nextLine().split(" ");
            String command = tokens[0];

            switch (command) {
                case "Join": {
                    String name = tokens[1];
                    frogs.add(name);
                }
                break;
                case "Jump": {
                    String name = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (isIndexValid(frogs, index)) {
                        frogs.add(index, name);
                    }
                }
                break;
                case "Dive": {
                    int index = Integer.parseInt(tokens[1]);
                    if (isIndexValid(frogs, index)) {
                        frogs.remove(index);
                    }
                }
                break;
                case "First": {
                    int count = Integer.parseInt(tokens[1]);
                    System.out.println(frogs.stream().limit(count).collect(Collectors.joining(" ")));
                }
                break;
                case "Last": {
                    int count = Integer.parseInt(tokens[1]);
                    System.out.println(frogs.stream().skip(Math.max(frogs.size() - count, 0)).collect(Collectors.joining(" ")));
                }
                break;
                case "Print": {
                    String subCommand = tokens[1];
                    if (subCommand.equals("Reversed")) {
                        Collections.reverse(frogs);
                    }
                    System.out.println("Frogs: " + String.join(" ", frogs));
                }
                return;
            }
        }
    }

    private static boolean isIndexValid(List<String> frogs, int index) {
        return index >= 0 && index < frogs.size();
    }
}
