import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scan.nextLine());
        double secondNumber = Double.parseDouble(scan.nextLine());
        double result = factorialDivision(firstNumber, secondNumber);
        System.out.println(String.format("%.2f", result));
    }

    public static double factorialDivision(double num1, double num2) {
        double firstFactorial = findFactorial(num1);
        double secondFactorial = findFactorial(num2);
        double result = firstFactorial / secondFactorial;
        return result;
    }

    public static double findFactorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
