import java.util.Scanner;

public class GiftboxCoverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sizeOfSide = Double.parseDouble(scan.nextLine());
        int numberOfSheets = Integer.parseInt(scan.nextLine());
        double areaSingleSheet = Double.parseDouble(scan.nextLine());
        double totalArea = 0.00;
        double areaGift = sizeOfSide * sizeOfSide * 6;

        for (int i = 1; i <= numberOfSheets; i++) {
            if (i % 3 == 0) {
                totalArea -= areaSingleSheet * 0.75;
            }

            totalArea += areaSingleSheet;
        }

        double percentage = (totalArea / areaGift) * 100;
        System.out.printf("You can cover %.2f%% of the box.", percentage);
    }
}
