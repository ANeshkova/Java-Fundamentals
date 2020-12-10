import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] particle = scan.nextLine().split("\\, ");
        List<String> arrayList = new ArrayList<>(Arrays.asList(particle));

        String input = scan.nextLine();

        while (!"Craft!".equals(input)) {
            String[] tokens = input.split(" \\- ");
            String command = tokens[0];

            switch (command) {
                case "Collect": {
                    String item = tokens[1];
                    if (!arrayList.contains(item)) {
                        arrayList.add(item);
                    }
                }
                break;
                case "Drop": {
                    String item = tokens[1];
                    if (arrayList.contains(item)) {
                        arrayList.remove(item);
                    }
                }
                break;
                case "Combine Items": {
                    String[] items = tokens[1].split("\\:");

                    String oldItem = items[0];
                    String newItem = items[1];

                    if (arrayList.contains(oldItem)) {
                        int indexOldItem = arrayList.indexOf(oldItem);
                        arrayList.add(indexOldItem + 1, newItem);
                    }
                }
                break;
                case "Renew": {
                    String item = tokens[1];
                    if (arrayList.contains(item)) {
                        arrayList.remove(item);
                        arrayList.add(item);
                    }
                }
                break;
            }

            input = scan.nextLine();
        }

        System.out.println(String.join(", ", arrayList));
    }
}
