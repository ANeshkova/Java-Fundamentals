import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double pricePerLightsaber = Double.parseDouble(scan.nextLine());
        double pricePerRobe = Double.parseDouble(scan.nextLine());
        double pricePerBelt = Double.parseDouble(scan.nextLine());

        double lightsabersTotalPrice = Math.ceil(studentsCount * 1.1) * pricePerLightsaber;
        double robesTotalPrice =  studentsCount * pricePerRobe;
        double freeBelts = studentsCount / 6;
        double beltsTotalPrice = (studentsCount - freeBelts) * pricePerBelt;

        double finalSum = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (finalSum > budget) {
            double moneyNeed = finalSum - budget;
            System.out.println(String.format("Ivan Cho will need %.2flv more.", moneyNeed));
        } else {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", finalSum));
        }
    }
}
