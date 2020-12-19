import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String input = scan.nextLine();

        while (!"Reveal".equals(input)) {
            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);

                    String start = message.substring(0, index);
                    String end = message.substring(index);
                    message = start + " " + end;

                    System.out.println(message);

                    break;
                case "Reverse": {
                    String substring = tokens[1];

                    if (message.contains(substring)) {
                        StringBuilder builder = new StringBuilder(substring);
                        builder.reverse();

                        int findIndex = message.indexOf(substring);
                        String firstPart = message.substring(0, findIndex);
                        String secondPart = message.substring(findIndex + substring.length());
                        message = firstPart + secondPart + builder;
                        System.out.println(message);

                    } else {
                        System.out.println("error");
                    }
                }
                break;
                case "ChangeAll": {
                    String substring = tokens[1];
                    String replacement = tokens[2];

                    while (message.contains(substring)) {
                        message = message.replace(substring, replacement);
                    }

                    System.out.println(message);
                }
                break;
            }

            input = scan.nextLine();
        }

        System.out.println("You have a new text message: " + message);
    }
}
