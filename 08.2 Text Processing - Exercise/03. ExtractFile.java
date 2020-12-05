import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int slashIndex = input.lastIndexOf('\\');
        int pointIndex = input.lastIndexOf('.');

        String name = input.substring(slashIndex + 1, pointIndex);
        String extension = input.substring(pointIndex + 1);

        System.out.println(String.format("File name: %s", name));
        System.out.println(String.format("File extension: %s", extension));
    }
}
