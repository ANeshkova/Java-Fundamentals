import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int snowballCount = Integer.parseInt(scan.nextLine());

        double maxValue = Double.MIN_VALUE;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        while (snowballCount-- > 0) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue >= maxValue) {
                maxValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }

        System.out.println(String.format("%d : %d = %.0f (%d)", bestSnow, bestTime, maxValue, bestQuality));
    }
}
