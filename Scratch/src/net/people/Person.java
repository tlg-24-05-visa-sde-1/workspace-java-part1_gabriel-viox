package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 *
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole year
     * this is the period of time
     */
    // Remember int to get that specific data of the instance
    public int getAge(){
    return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public Object getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString(){
        return  String.format("net.people.Person: name = %s, birthDate = %s",  getName(), getBirthDate());
    }
}
