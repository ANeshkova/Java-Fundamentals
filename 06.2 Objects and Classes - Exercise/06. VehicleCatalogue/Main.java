package VehicleCatalogue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String input = scan.nextLine();

        while (!input.equals("End")) {
            String tokens[] = input.split("\\s+");

            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsePower = Integer.parseInt(tokens[3]);
            Vehicle vehicle;

            if ("car".equals(type)) {
                vehicle = new Vehicle("Car", model, color, horsePower);
                vehicles.add(vehicle);
            } else {
                vehicle = new Vehicle("Truck", model, color, horsePower);
            }

            vehicles.add(vehicle);
            input = scan.nextLine();
        }

        String model = scan.nextLine();

        while (!"Close the Catalogue".equals(model)) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                    break;
                }
            }
            model = scan.nextLine();
        }

        double carHP = printHorsePower(vehicles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHP));
        double truckHP = printHorsePower(vehicles, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHP));
    }

    private static double printHorsePower(ArrayList<Vehicle> vehicles, String type) {
        double sum = 0.00;
        int counter = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                sum += vehicle.getHorsepower();
                counter++;
            }
        }

        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}

