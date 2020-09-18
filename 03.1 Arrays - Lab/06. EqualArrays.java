import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");
        int[] firstArr = new int[first.length];
        int[] secondArr = new int[second.length];
        int sum = 0;
        String result = " ";

        for (int i = 0; i < first.length; i++) {
            firstArr[i] = Integer.parseInt(first[i]);
        }

        for (int i = 0; i < second.length; i++) {
            secondArr[i] = Integer.parseInt(second[i]);
        }

        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];

            if (firstArr[i] != secondArr[i]) {
                result = String.format("Arrays are not identical. Found difference at %d index.", i);
                break;
            } else {
                result = String.format("Arrays are identical. Sum: %d ", sum);
            }
        }

        System.out.println(result);
    }
}
