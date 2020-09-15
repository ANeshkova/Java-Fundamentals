import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int capacity = 255;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scan.nextLine());
            sum += liters;
            if (sum > capacity) {
                System.out.println("Insufficient capacity!");
                sum -= liters;
            }
        }

        System.out.printf("%d", sum);
    }
}
