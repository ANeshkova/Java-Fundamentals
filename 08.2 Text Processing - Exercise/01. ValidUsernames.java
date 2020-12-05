import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] usernames = scan.nextLine().split(", ");

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char letter = username.charAt(i);
            if (!Character.isLetterOrDigit(letter) && letter != '_' && letter != '-') {
                return false;
            }
        }
        return true;
    }
}
