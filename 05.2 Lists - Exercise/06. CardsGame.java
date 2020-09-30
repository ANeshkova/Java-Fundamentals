import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> first = readIntList(scan);
        List<Integer> second = readIntList(scan);

        while (!first.isEmpty() && !second.isEmpty()) {
            int firstElement = first.remove(0);
            int secondElement = second.remove(0);

            if (firstElement > secondElement) {
                first.add(firstElement);
                first.add(secondElement);
            } else if (secondElement > firstElement) {
                second.add(secondElement);
                second.add(firstElement);
            }
        }

        if (first.isEmpty()) {
            int sum = getSum(second);
            System.out.println(String.format("Second player wins! Sum: %d", sum));
        } else {
            int sum = getSum(first);
            System.out.println(String.format("First player wins! Sum: %d", sum));
        }
    }

    private static int getSum(List<Integer> first) {
        int sum = 0;
        for (Integer integer : first) {
            sum += integer;
        }
        return sum;
    }

    private static List<Integer> readIntList(Scanner scan) {
        return Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
