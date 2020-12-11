import java.util.Scanner;

public class MuOnlineSecondVariant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rooms = scan.nextLine().split("\\|");

        int currentHealth = 100;
        int bitcoins = 0;

        loop:
        for (int i = 0; i < rooms.length; i++) {
            String[] command = rooms[i].split("\\s+");

            switch (command[0]) {
                case "potion":
                    int amount = Integer.parseInt(command[1]);

                    if (currentHealth + amount <= 100) {
                        currentHealth += amount;
                    } else {
                        amount = 100 - currentHealth;
                        currentHealth += amount;
                    }

                    System.out.println("You healed for " + amount + " hp.");
                    System.out.println("Current health: " + currentHealth + " hp.");
                    break;
                case "chest":
                    int someBitcoins = Integer.parseInt(command[1]);
                    bitcoins += someBitcoins;
                    System.out.println("You found " + someBitcoins + " bitcoins.");
                    break;
                default:
                    int attack = Integer.parseInt(command[1]);
                    currentHealth -= attack;

                    if (currentHealth > 0) {
                        System.out.println("You slayed " + command[0] + ".");
                    } else {
                        System.out.println("You died! Killed by " + command[0] + ".");
                        System.out.println("Best room: " + (i + 1));
                        break loop;
                    }
                    break;
            }
        }

        if (currentHealth > 0) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", currentHealth);
        }
    }
}
