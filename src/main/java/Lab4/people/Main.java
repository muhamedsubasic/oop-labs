package Lab4.people;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1.a
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
        System.out.println("/////////////////////////////////////////");
        // Task 1.b
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
        System.out.println("/////////////////////////////////////////");
        // Task 1.c
        Teacher pekka1 = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko1 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekka1);
        System.out.println(esko1);

        Student olli1 = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli1.study();
        }
        System.out.println(olli1);
        System.out.println(" credits " + olli1.credits());
        System.out.println("/////////////////////////////////////////");
        // Task 1.d
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        printDepartment(people);
        System.out.println("/////////////////////////////////////////");
    }

    public static void printDepartment(List<Person> people) {
        // we print all the people in the department
        for (Person person : people){
            System.out.println(person);
        }
    }
}