import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, int[]> map = new TreeMap<>();
        int n = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        for (int i = 0; i < n; i++) {
            String[] tokens = input.split("\\|");
            String car = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);

            if (!map.containsKey(car)) {
                map.put(car, new int[2]);
                map.get(car)[0] = mileage;
                map.get(car)[1] = fuel;
            }

            input = scan.nextLine();
        }

        while (!input.equals("Stop")) {
            String[] tokens2 = input.split(" : ");
            String command = tokens2[0];
            String car = tokens2[1];

            switch (command) {
                case "Drive": {
                    int distance = Integer.parseInt(tokens2[2]);
                    int fuel = Integer.parseInt(tokens2[3]);

                    if (map.get(car)[1] >= fuel) {
                        int currentFuel = map.get(car)[1];
                        map.get(car)[1] = currentFuel - fuel;
                        map.get(car)[0] += distance;
                        System.out.println(String.format
                                ("%s driven for %d kilometers. %d liters of fuel consumed.", car, distance, fuel));

                        if (map.get(car)[0] > 100000) {
                            System.out.println("Time to sell the " + car + "!");
                            map.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                }
                break;

                case "Refuel":
                    int newFuel = Integer.parseInt(tokens2[2]);
                    int currentFuel = map.get(car)[1];

                    if (currentFuel + newFuel > 75) {
                        int lastFuel = 75 - currentFuel;
                        map.get(car)[1] = 75;
                        System.out.println(String.format("%s refueled with %d liters", car, lastFuel));
                    } else {
                        map.get(car)[1] = currentFuel + newFuel;
                        System.out.println(String.format("%s refueled with %d liters", car, newFuel));
                    }
                    break;

                case "Revert":
                    int kilometers = Integer.parseInt(tokens2[2]);

                    int currentKM = map.get(car)[0];
                    map.get(car)[0] = currentKM - kilometers;

                    if (map.get(car)[0] <= 10000) {
                        map.get(car)[0] = 10000;
                    } else {
                        System.out.println(String.format(
                                "%s mileage decreased by %d kilometers", car, kilometers));
                    }
                    break;
            }

            input = scan.nextLine();
        }

        map
                .entrySet()
                .stream()
                .sorted((ml1, ml2) -> ml2.getValue()[0] - ml1.getValue()[0])
                .forEach(e -> System.out.println(String.format(
                        "%s -> Mileage: %d kms, Fuel in the tank: %d lt.", e.getKey(), e.getValue()[0], e.getValue()[1])));

    }
}
