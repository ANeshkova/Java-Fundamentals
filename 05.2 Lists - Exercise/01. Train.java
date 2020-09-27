import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = readIntList(scan);
        int waggonCapacity = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");

            if (tokens[0].equals("Add")) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);

                for (int i = 0; i < train.size(); i++) {
                    int currentWaggon = train.get(i);
                    int totalCount = currentWaggon + people;
                    if (totalCount <= waggonCapacity) {
                        train.set(i, totalCount);
                        break;
                    }
                }
            }

            input = scan.nextLine();
        }
        printTrain(train);
    }

    private static List<Integer> readIntList(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        ArrayList<Integer> outputList = new ArrayList<>();

        for (String element : input){
            outputList.add(Integer.parseInt(element));
        }
        return outputList;
    }

    private static void printTrain(List<Integer> train) {
        for (int waggon : train) {
            System.out.print(waggon + " ");
        }
    }
}
