import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());
        double lectures = Integer.parseInt(scan.nextLine());
        int initialBonus = Integer.parseInt(scan.nextLine());

        double totalBonus = 0.00;
        int maxAttendances = 0;

        for (int i = 1; i <= students; i++) {
            int attendances = Integer.parseInt(scan.nextLine());
            if (attendances > maxAttendances) {
                maxAttendances = attendances;
                totalBonus = attendances / lectures * (5 + initialBonus);
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(totalBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
