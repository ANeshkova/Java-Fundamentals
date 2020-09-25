import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        while (!number.equals("END")){
            System.out.println(reversed(number));

            number = scan.nextLine();
        }
    }

    public static String reversed (String number) {
        String output = "";
        String reversed = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            reversed += number.charAt(i);
        }

        if (reversed.equals(number)) {
            output = "true";
        } else {
            output = "false";
        }
        return output;
    }
}
