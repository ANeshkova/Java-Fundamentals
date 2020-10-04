package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {

    private static class Student {
        private String firstName;
        private String secondName;
        private double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public double getGrade() {
            return this.grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName, secondName, grade);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();

        while (n-- > 0) {
            String[] input = scan.nextLine().split(" ");
            String firstName = input[0];
            String secondName = input[1];
            double grade = Double.parseDouble(input[2]);
            Student student = new Student(firstName, secondName, grade);
            students.add(student);
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
