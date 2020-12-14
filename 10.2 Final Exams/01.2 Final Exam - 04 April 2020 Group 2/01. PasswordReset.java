import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();
        String input2 = scan.nextLine();

        while (!"Done".equals(input2)) {
            String[] tokens = input2.split("\\s");
            String command = tokens[0];

            switch (command) {
                case "TakeOdd":
                    String temporary = "";

                    for (int i = 1; i < string.length(); i += 2) {
                        temporary += string.charAt(i);
                    }

                    string = temporary;
                    System.out.println(string);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String before = string.substring(0, startIndex);
                    String after = string.substring(startIndex + length);
                    string = before + after;

                    System.out.println(string);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    String temp = "";

                    if (string.contains(substring)) {
                        temp = string.replace(substring, substitute);
                        string = temp;
                        System.out.println(string);

                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input2 = scan.nextLine();
        }

        System.out.println("Your password is: " + string);
    }
}
