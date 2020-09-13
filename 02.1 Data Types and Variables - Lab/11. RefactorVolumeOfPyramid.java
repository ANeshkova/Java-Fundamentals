import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length;
        System.out.print("Length: ");
        length = Double.parseDouble(scan.nextLine());

        double width;
        System.out.print("Width: ");
        width = Double.parseDouble(scan.nextLine());

        double height;
        System.out.print("Height: ");
        height = Double.parseDouble(scan.nextLine());

        double sum = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", sum);
    }
}
