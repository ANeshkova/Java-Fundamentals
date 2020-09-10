import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        double money = 0;

        while (!command.equals("Start")) {

            double insert = Double.parseDouble(command);
            if (insert != 0.1 && insert != 0.2 && insert != 0.5 && insert != 1 && insert != 2) {
                System.out.printf("Cannot accept %.2f%n", insert);

            } else {
                money += insert;
            }
            command = scan.nextLine();
        }

        String product = scan.nextLine();
        double price = 0;

        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    if (price > money) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        money = money - price;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (price > money) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        money = money - price;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (price > money) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        money = money - price;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (price > money) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        money = money - price;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (price > money) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        money = money - price;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scan.nextLine();
        }

        System.out.printf("Change: %.2f", money);
    }
}
