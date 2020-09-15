import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double volume;
        double max = 0;
        String maxModel = "";

        for (int i = 1; i <= n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            volume = Math.PI * radius * radius * height;

            if (volume > max) {
                max = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
