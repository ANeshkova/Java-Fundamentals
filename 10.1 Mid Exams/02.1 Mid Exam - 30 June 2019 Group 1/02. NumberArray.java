import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scan.nextLine();
        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command) {
                case "Switch": {
                    int index = Integer.parseInt(tokens[1]);
                    if (isIndexValid(numbers, index)) {
                        numbers[index] = numbers[index] * -1;
                    }
                }
                break;
                case "Change": {
                    int index = Integer.parseInt(tokens[1]);
                    if (isIndexValid(numbers, index)) {
                        numbers[index] = Integer.parseInt(tokens[2]);
                    }
                }
                break;
                case "Sum":
                    String secondCommand = tokens[1];
                    switch (secondCommand) {
                        case "Negative":
                            System.out.println(Arrays.stream(numbers).filter(value -> value < 0).sum());
                            break;
                        case "Positive":
                            System.out.println(Arrays.stream(numbers).filter(value -> value >= 0).sum());
                            break;
                        case "All":
                            System.out.println(Arrays.stream(numbers).sum());
                            break;
                    }
                    break;
            }

            input = scan.nextLine();
        }

        for (int number : numbers) {
            if (number >= 0) {
                System.out.print(number + " ");
            }
        }
    }

    private static boolean isIndexValid(int[] numbers, int index) {
        return index >= 0 && index < numbers.length;
    }
}
