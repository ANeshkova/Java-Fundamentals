import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String action = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        printCalculations(action, a, b);
    }

    private static void printCalculations(String action, int a, int b) {
        int sum = 0;

        if (action.equals("add")) {
            sum = a + b;
        }

        if (action.equals("multiply")) {
            sum = a * b;
        }

        if (action.equals("subtract")) {
            sum = a - b;
        }

        if (action.equals("divide")) {
            sum = a / b;
        }

        System.out.println(sum);
    }
}
