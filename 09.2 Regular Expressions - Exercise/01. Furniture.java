import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = ">>([A-Za-z]+)<<([0-9]+\\.?[0-9]+)\\!([0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        double totalPrice = 0.0;
        List<String> furniture = new ArrayList<>();

        while (!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String item = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));

                furniture.add(item);
                totalPrice += price * quantity;
            }

            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String s : furniture) {
            System.out.println(s);
        }

        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
