import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> map = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");

            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (!map.containsKey(city)) {

                map.put(city, new int[2]);
                map.get(city)[0] = population;
                map.get(city)[1] = gold;
            } else {

                int currentPopulation = map.get(city)[0];
                map.get(city)[0] = currentPopulation + population;

                int currentGold = map.get(city)[1];
                map.get(city)[1] = currentGold + gold;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens2 = input.split("\\=>");
            String command = tokens2[0];
            String town = tokens2[1];

            switch (command) {
                case "Plunder": {
                    int people = Integer.parseInt(tokens2[2]);
                    int gold = Integer.parseInt(tokens2[3]);

                    if (map.containsKey(town)) {
                        int currentPopulation = map.get(town)[0];
                        map.get(town)[0] = currentPopulation - people;

                        int currentGold = map.get(town)[1];
                        map.get(town)[1] = currentGold - gold;

                        System.out.println(String.format("%s plundered! %d gold stolen, %d citizens killed.", town, gold, people));
                    }

                    if (map.get(town)[0] <= 0 || map.get(town)[1] <= 0) {
                        map.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                }
                break;

                case "Prosper": {
                    int gold = Integer.parseInt(tokens2[2]);
                    if (gold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        if (map.containsKey(town)) {
                            int currentGold = map.get(town)[1];
                            map.get(town)[1] = currentGold + gold;
                            System.out.println(String.format("%d gold added to the city treasury. %s now has %d gold.", gold, town, map.get(town)[1]));
                        }
                    }
                    break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Ahoy, Captain! There are " + map.size() + " wealthy settlements to go to:");
        map
                .entrySet()
                .stream()
                .sorted((g1, g2) -> g2.getValue()[1] - g1.getValue()[1])
                .forEach(e -> System.out.println(
                        String.format("%s -> Population: %d citizens, Gold: %d kg", e.getKey(), e.getValue()[0], e.getValue()[1])));
    }
}
