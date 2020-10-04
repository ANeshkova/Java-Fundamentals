package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person{
        String name;
        String id;
        int age;

        Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName () {
            return this.name;
        }

        public String getId () {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input =  scan.nextLine();

        List<Person> people = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            input = scan.nextLine();
        }

        people.sort(Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.println(String.format(
                    "%s with ID: %s is %d years old.",
                    person.getName(),
                    person.getId(),
                    person.getAge()
            ));
        }
    }
}
