import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double price;

        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                price = people * 8.45;
            } else if (day.equals("Saturday")) {
                price = people * 9.80;
            } else {
                price = people * 10.46;
            }
            if (people >= 30) {
                price -= price * 0.15;
            }

        } else if (type.equals("Business")) {
            if (day.equals("Friday")) {
                price = people * 10.90;
                if (people >= 100) {
                    price = price - (10 * 10.90);
                }
            } else if (day.equals("Saturday")) {
                price = people * 15.60;
                if (people >= 100) {
                    price = price - (10 * 15.60);
                }
            } else {
                price = people * 16;
                if (people >= 100) {
                    price = price - (10 * 16);
                }
            }

        } else {
            if (day.equals("Friday")) {
                price = people * 15;
            } else if (day.equals("Saturday")) {
                price = people * 20;
            } else {
                price = people * 22.50;
            }
            if (people >= 10 && people <= 20) {
                price *= 0.95;
            }
        }

        System.out.printf("Total price: %.2f", price);
    }
}
