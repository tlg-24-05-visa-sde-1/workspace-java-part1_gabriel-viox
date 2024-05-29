package net.people;

import java.time.LocalDate;

public class PersonClient {
    public static void main(String[] args){
        Person p1 = new Person( "Gabriel", LocalDate.of(1994, 6, 17));
        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());


        System.out.println(p1); // toString automatically called
        System.out.println();

        Person p2 = new Person("Artemis", LocalDate.of(2019, 8, 10));
        System.out.printf("%s is %s years old\n", p2.getName(), p2.getAge());
        System.out.println(p2);
    }
}
