import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scan.nextLine());
        double distanceInKilometers = distanceInMeters / 1000.0;

        System.out.printf("%.2f", distanceInKilometers);
    }
}
