import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = num; i > 0; i--) {
            String input = scan.nextLine();
            char letter = input.charAt(0);
            sum += letter;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
