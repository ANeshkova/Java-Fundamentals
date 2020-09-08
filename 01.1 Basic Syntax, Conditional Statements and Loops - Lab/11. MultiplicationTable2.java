import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int times = Integer.parseInt(scan.nextLine());

        for (int i = times; i < 11; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }
		
        if (times > 10) {
            System.out.printf("%d X %d = %d%n", num, times, num * times);
        }
    }
}
