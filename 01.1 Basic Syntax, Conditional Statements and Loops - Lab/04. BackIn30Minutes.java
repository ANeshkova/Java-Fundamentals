import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int h = hours * 60;
        int m = h + minutes + 30;
        int outputHours = m / 60;
        int outputMinutes = m % 60;

        if (outputHours > 23) {
            outputHours = 0;
        }
        if (outputMinutes < 10) {
            System.out.printf("%d:0%d", outputHours, outputMinutes);
        } else {
            System.out.printf("%d:%d", outputHours, outputMinutes);
        }
    }
}
