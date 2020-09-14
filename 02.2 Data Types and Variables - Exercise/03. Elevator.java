import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacityOfPeople = Integer.parseInt(scan.nextLine());
        int courses = (int) Math.ceil((double) numberOfPeople / capacityOfPeople);

        System.out.println(courses);
    }
}
