import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(key);

        while (!"Generate".equals(input)) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    String substring = tokens[1];
                    String text = builder.toString();
                    if (text.contains(substring)) {
                        System.out.println(String.format("%s contains %s", text, substring));
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip": {
                    String upLow = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    //String word = key.substring(startIndex, endIndex);

                    switch (upLow) {
                        case "Upper": {
                            //word = word.toUpperCase();
                            //builder.replace(startIndex, endIndex, word);

                            String words = builder.substring(startIndex, endIndex);
                            builder.delete(startIndex, endIndex);
                            builder.insert(startIndex, words.toUpperCase());
                            System.out.println(builder);
                        }
                        break;
                        case "Lower":
                            //builder.replace(startIndex, endIndex, word.toLowerCase());

                            String words = builder.substring(startIndex, endIndex);
                            builder.delete(startIndex, endIndex);
                            builder.insert(startIndex, words.toLowerCase());
                            System.out.println(builder);
                            break;
                    }
                }
                break;
                case "Slice":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    builder.delete(startIndex, endIndex);
                    System.out.println(builder);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.format("Your activation key is: %s", builder));
    }
}
