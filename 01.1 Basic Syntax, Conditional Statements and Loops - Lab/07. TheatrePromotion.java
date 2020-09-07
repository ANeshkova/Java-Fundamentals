import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine().toLowerCase();
        int age = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if (0 <= age && age <= 18) {
            if (day.equals("weekday")) {
                price = 12;
            } else if (day.equals("weekend")) {
                price = 15;
            } else {
                price = 5;
            }
			
        } else if (18 < age && age <= 64) {
            if (day.equals("weekday")) {
                price = 18;
            } else if (day.equals("weekend")) {
                price = 20;
            } else {
                price = 12;
            }
			
        } else if (64 < age && age <= 122) {
            if (day.equals("weekday")) {
                price = 12;
            } else if (day.equals("weekend")) {
                price = 15;
            } else {
                price = 10;
            }
        }
		
        if (price != 0.0){
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
