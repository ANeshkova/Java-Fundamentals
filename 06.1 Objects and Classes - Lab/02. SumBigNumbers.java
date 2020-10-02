import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());

        BigInteger sum = a.add(b);

        System.out.println(sum);
    }
}
