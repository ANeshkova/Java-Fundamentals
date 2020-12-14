import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int steps = Integer.parseInt(scan.nextLine());
        double cm = Double.parseDouble(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        double totalDistance = 0.00;

        for (int i = 1; i <= steps; i++) {
            totalDistance += cm;
            if (i % 5 == 0) {
                totalDistance -= cm * 0.30;
            }
        }

        double percentage = (totalDistance / distance);
        System.out.printf("You travelled %.2f%% of the distance!", percentage);
    }
}
