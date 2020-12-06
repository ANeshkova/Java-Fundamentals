import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String remove = scan.nextLine();
        String word = scan.nextLine();
        int index = word.indexOf(remove);

        while (index != -1) {
            for (int i = 0; i < word.length(); i++) {
                word = word.replace(remove, "");
                index = word.indexOf(remove);
            }
        }
        System.out.println(word);
    }
}
