package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {
    // for free, you get the following from the PersonRecord.class
    // two private fields
    // 2-arg constructor
    // getters for each, with the get prefix omitted name() instead of getName()
    // toString() and hashcode()


    public int age(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
