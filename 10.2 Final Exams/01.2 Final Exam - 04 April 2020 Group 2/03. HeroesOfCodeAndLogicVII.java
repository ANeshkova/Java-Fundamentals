import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, int[]> map = new TreeMap<>();
        int n = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        for (int i = 0; i < n; i++) {

            String[] tokens = input.split("\\s+");

            String hero = tokens[0];
            int HP = Integer.parseInt(tokens[1]);
            int MP = Integer.parseInt(tokens[2]);

            if (!map.containsKey(hero)) {
                map.put(hero, new int[2]);
                map.get(hero)[0] = HP;
                map.get(hero)[1] = MP;
            }

            input = scan.nextLine();
        }

        while (!input.equals("End")) {
            String[] tokens2 = input.split(" \\- ");
            String command = tokens2[0];
            String hero = tokens2[1];

            switch (command) {

                case "CastSpell":
                    int neededMP = Integer.parseInt(tokens2[2]);
                    String spell = tokens2[3];

                    if (map.get(hero)[1] >= neededMP) {
                        int currentMP = map.get(hero)[1];
                        map.get(hero)[1] = currentMP - neededMP;

                        System.out.println(String.format
                                ("%s has successfully cast %s and now has %d MP!", hero, spell, map.get(hero)[1]));
                    } else {
                        System.out.println(String.format("%s does not have enough MP to cast %s!", hero, spell));
                    }
                    break;
                case "TakeDamage": {
                    int damage = Integer.parseInt(tokens2[2]);
                    String attacker = tokens2[3];
                    int currentHP = map.get(hero)[0];
                    map.get(hero)[0] = currentHP - damage;

                    if (map.get(hero)[0] <= 0) {
                        map.remove(hero);
                        System.out.println(String.format("%s has been killed by %s!", hero, attacker));
                    } else {
                        System.out.println(String.format(
                                "%s was hit for %d HP by %s and now has %d HP left!", hero, damage, attacker, map.get(hero)[0]));
                    }
                }
                break;
                case "Recharge":
                    int amountMP = Integer.parseInt(tokens2[2]);
                    int currentMP = map.get(hero)[1];

                    if (currentMP + amountMP > 200) {
                        int poslednoMP = 200 - currentMP;
                        map.get(hero)[1] = 200;
                        System.out.println(String.format("%s recharged for %d MP!", hero, poslednoMP));
                    } else {
                        map.get(hero)[1] = currentMP + amountMP;
                        System.out.println(String.format("%s recharged for %d MP!", hero, amountMP));
                    }
                    break;

                case "Heal":
                    int amountHP = Integer.parseInt(tokens2[2]);
                    int currentHP = map.get(hero)[0];

                    if (currentHP + amountHP > 100) {
                        int poslednoHP = 100 - currentHP;
                        map.get(hero)[0] = 100;
                        System.out.println(String.format("%s healed for %d HP!", hero, poslednoHP));
                    } else {
                        map.get(hero)[0] = currentHP + amountHP;
                        System.out.println(String.format("%s healed for %d HP!", hero, amountHP));
                    }
                    break;
            }

            input = scan.nextLine();
        }

        map
                .entrySet()
                .stream()
                .sorted((hp1, hp2) -> hp2.getValue()[0] - hp1.getValue()[0])
                .forEach(e -> {
                    System.out.println(e.getKey());
                    System.out.println("HP: " + e.getValue()[0]);
                    System.out.println("MP: " + e.getValue()[1]);
                });

    }
}
