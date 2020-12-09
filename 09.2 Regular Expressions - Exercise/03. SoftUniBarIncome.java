import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile
                ("%([A-Z][a-z]+)%[^|$%.]*?<(\\w+)>[^|$%.]*?\\|([0-9]+)\\|[^|$%.]*?([0-9]+\\.?[0-9]+?)\\$");
        double totalPrice = 0.0;

        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group(1);
                String product = matcher.group(2);
                int quantity = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));

                double sum = quantity * price;
                totalPrice += sum;

                System.out.println(String.format("%s: %s - %.2f", name, product, sum));
            }

            input = scan.nextLine();
        }

        System.out.printf("Total income: %.2f", totalPrice);
    }
}
