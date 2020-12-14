import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "(@#+)([A-Z][a-zA-Z0-9]{4,}[A-Z])(@#+)";

        // "(@#+)([A-Z][a-zA-Z0-9]{5,})(@#+)";
        //"(\\@\\#+)([A-Z][a-zA-Z0-9][A-Z]$){5,}(\\1)";
        Pattern pattern = Pattern.compile(regex);

        for (int j = 0; j < n; j++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            String digits = "";

            if (matcher.find()) {
                String product = matcher.group(2);

                for (int i = 0; i < product.length(); i++) {
                    char c = product.charAt(i);

                    if (Character.isDigit(c)) {
                        digits += product.charAt(i);
                    }
                }

                if (digits.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println(String.format("Product group: %s", digits));
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
