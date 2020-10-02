import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        String data = scan.nextLine();

        while (!"end".equals(data)) {
            String[] tokens = data.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setCity(city);

            students.add(student);

            data = scan.nextLine();
        }

        String city = scan.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(city)) {
                System.out.println(String.format("%s %s is %d years old",
                        student.getFirstName(), student.getLastName(), student.getAge()));
            }
        }
    }

    private static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public Student() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
