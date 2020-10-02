import java.math.BigDecimal;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal(1);

        for (int i = number; i > 0 ; i--) {
            BigDecimal num1 = new BigDecimal(i);
            sum = sum.multiply(num1);
        }

        System.out.println(sum);
    }
}
