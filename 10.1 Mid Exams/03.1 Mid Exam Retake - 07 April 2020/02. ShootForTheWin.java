import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> input = Arrays.stream
                (scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int count = 0;
        String number = scan.nextLine();

        while (!"End".equals(number)) {
            int index = Integer.parseInt(number);

            if (index >= 0 && index < input.size()) {
                int value = input.get(index);

                for (int i = 0; i < input.size(); i++) {
                    if (input.get(i) != -1) {

                        if (value < input.get(i)) {
                            int newValue = input.get(i) - value;
                            input.set(i, newValue);
                        } else {
                            int newValue = input.get(i) + value;
                            input.set(i, newValue);
                        }

                        input.set(index, -1);
                    }
                }

                count++;
            }

            number = scan.nextLine();
        }

        System.out.print(String.format("Shot targets: %d -> ", count));

        for (int i = 0; i < input.size(); i++) {
            if (i == input.size() - 1) {
                System.out.print(input.get(i));
            } else {
                System.out.print(input.get(i) + " ");
            }
        }
    }
}
