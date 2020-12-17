import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        String distance = scan.nextLine();
        int wonBattle = 0;
        boolean isEnergyEnough = true;

        while (!"End of battle".equals(distance)) {

            if (energy - Integer.parseInt(distance) < 0) {
                isEnergyEnough = false;
                break;
            }

            energy -= Integer.parseInt(distance);
            wonBattle++;

            if (wonBattle % 3 == 0) {
                energy += wonBattle;
            }

            distance = scan.nextLine();
        }

        if (isEnergyEnough) {
            System.out.println(String.format("Won battles: %d. Energy left: %d", wonBattle, energy));
        } else {
            System.out.println(String.format
                    ("Not enough energy! Game ends with %d won battles and %d energy", wonBattle, energy));
        }
    }
}
