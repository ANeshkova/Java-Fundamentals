import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int games = Integer.parseInt(scan.nextLine());
        double handsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double handsetCost = (games / 2) * handsetPrice;
        double mouseCost = (games / 3) * mousePrice;
        double keyboardCost = (games / 6) * keyboardPrice;
        double displayCost = (games / 12) * displayPrice;

        double totalCost = handsetCost + mouseCost + keyboardCost + displayCost;

        System.out.println(String.format("Rage expenses: %.2f lv.%n", totalCost));
    }
}
