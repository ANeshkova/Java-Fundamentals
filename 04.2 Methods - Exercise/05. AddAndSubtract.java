import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int all = printSubtract(num1, num2, num3);
        System.out.println(all);
    }

    public static int printSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int printSubtract(int num1, int num2, int num3) {
        return printSum(num1, num2) - num3;
    }
}
