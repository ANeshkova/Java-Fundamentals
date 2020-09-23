import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String symbol = scan.nextLine();

        if (symbol.equals("int")) {
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            int result = printMax(a, b);
            System.out.println(result);

        } else if (symbol.equals("char")) {
            char a = scan.nextLine().charAt(0);
            char b = scan.nextLine().charAt(0);
            char result1 = printMax(a, b);

            System.out.println(result1);

        } else if (symbol.equals("string")) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            String result = printMax(a, b);

            System.out.println(result);
        }
    }

    private static int printMax(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    private static char printMax(char a, char b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    private static String printMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}
