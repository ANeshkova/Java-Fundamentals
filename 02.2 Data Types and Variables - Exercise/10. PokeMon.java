import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pokePower = Integer.parseInt(scan.nextLine());         //N
        int distance = Integer.parseInt(scan.nextLine());          //M
        int exhaustionFactor = Integer.parseInt(scan.nextLine());  //Y

        int initialPower = pokePower;
        int pokedTargets = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokedTargets++;

            if (pokePower == initialPower / 2.00 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
