import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());
        double result = calculate(a, operation, b);

        System.out.printf("%.0f", result);
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0;

        if (operator.equals("/")) {
            if (b != 0) {
                result = a / b;
            }
        }

        if (operator.equals("*")) {
            result = a * b;
        }

        if (operator.equals("+")) {
            result = a + b;
        }

        if (operator.equals("-")) {
            result = a - b;
        }

        return result;
    }
}
