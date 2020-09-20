import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int target = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            int firstNumber = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int secondNumber = numbers[j];

                if (firstNumber + secondNumber == target) {
                    System.out.println(firstNumber + " " + secondNumber);
                }
            }
        }
    }
}
