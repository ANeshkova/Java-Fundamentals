import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(result);
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int digit) {
        digit = Math.abs(digit);
        int sum = 0;

        while (digit > 0) {
            int result = digit % 10;
            if (result % 2 == 0) {
                sum += result;
            }
            digit = digit / 10;
        }

        return sum;
    }

    private static int getSumOfOddDigits(int digit) {
        digit = Math.abs(digit);
        int sum = 0;

        while (digit > 0) {
            int result = digit % 10;
            if (result % 2 != 0) {
                sum += result;
            }
            digit = digit / 10;
        }

        return sum;
    }
}
