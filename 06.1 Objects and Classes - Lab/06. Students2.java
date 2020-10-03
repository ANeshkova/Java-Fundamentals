import java.util.ArrayList;
import java.util.Scanner;

public class Students2 {
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

            if (isStudentExist(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

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

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
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

    private static boolean isStudentExist(ArrayList<Student> students, String firstName, String lastName) {

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(ArrayList<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}
