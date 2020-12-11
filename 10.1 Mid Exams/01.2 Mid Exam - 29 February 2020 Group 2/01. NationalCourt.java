import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int people = Integer.parseInt(scan.nextLine());

        int allForOneHour = first + second + third;
        int sumOfPeople = 0;
        int hours = 0;

        for (int i = 1; i <= people; i++) {
            sumOfPeople += allForOneHour;
            if (i % 4 == 0) {
                i++;
            }

            hours = i;
            if (sumOfPeople >= people) {
                break;
            }
        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
