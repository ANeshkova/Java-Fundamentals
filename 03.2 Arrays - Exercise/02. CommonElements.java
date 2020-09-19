import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArr = scan.nextLine().split(" ");
        String[] secondArr = scan.nextLine().split(" ");

        for (String secEL : secondArr) {
            for (String firstEl : firstArr) {
                if (secEL.equals(firstEl)) {
                    System.out.print(firstEl + " ");
                }
            }
        }
    }
}
