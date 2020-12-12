import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] list = scan.nextLine().split("!");
        List<String> arrayList = new ArrayList<>(Arrays.asList(list));

        String command = scan.nextLine();

        while (!"Go Shopping!".equals(command)) {
            String[] tokens = command.split("\\s+");
            String firstCommand = tokens[0];
            String secondCommand = tokens[1];

            switch (firstCommand) {
                case "Urgent":
                    if (!arrayList.contains(secondCommand)) {
                        arrayList.add(0, secondCommand);
                    }
                    break;
                case "Unnecessary":
                    if (arrayList.contains(secondCommand)) {
                        arrayList.remove(secondCommand);
                    }
                    break;
                case "Correct":
                    if (arrayList.contains(secondCommand)) {
                        int i = arrayList.indexOf(secondCommand);
                        arrayList.remove(secondCommand);
                        arrayList.add(i, tokens[2]);
                    }
                    break;
                case "Rearrange":
                    if (arrayList.contains(secondCommand)) {
                        arrayList.remove(secondCommand);
                        arrayList.add(secondCommand);
                    }
                    break;
            }

            command = scan.nextLine();
        }

        System.out.println(String.join(", ", arrayList));
    }
}
