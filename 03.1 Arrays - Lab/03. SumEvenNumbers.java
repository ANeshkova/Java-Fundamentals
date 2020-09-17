import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int evenSum = 0;

        for (int i = 0; i < input.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }

        System.out.println(evenSum);
    }
}
