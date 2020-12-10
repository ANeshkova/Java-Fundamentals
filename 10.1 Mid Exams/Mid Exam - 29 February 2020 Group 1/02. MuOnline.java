import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rooms = scan.nextLine().split("\\|");

        int currentHealth = 100;
        int bitcoins = 0;

        for (int i = 0; i < rooms.length; i++) {
            String[] command = rooms[i].split("\\s+");

            if ("potion".equals(command[0])) {
                int amount = Integer.parseInt(command[1]);

                if (currentHealth + amount <= 100) {
                    currentHealth += amount;
                } else {
                    amount = 100 - currentHealth;
                    currentHealth += amount;
                }

                System.out.println("You healed for " + amount + " hp.");
                System.out.println("Current health: " + currentHealth + " hp.");

            } else if ("chest".equals(command[0])) {
                int someBitcoins = Integer.parseInt(command[1]);
                bitcoins += someBitcoins;
                System.out.println("You found " + someBitcoins + " bitcoins.");

            } else {
                int attack = Integer.parseInt(command[1]);
                currentHealth -= attack;

                if (currentHealth > 0) {
                    System.out.println("You slayed " + command[0] + ".");
                } else {
                    System.out.println("You died! Killed by " + command[0] + ".");
                    System.out.println("Best room: " + (i + 1));
                    break;
                }
            }
        }

        if (currentHealth > 0) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", currentHealth);
        }
    }
}
