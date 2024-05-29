package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    // constructor
    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work(){
        System.out.println(getName() + " enjoying the morning at my expense");
    }

    @Override
    public void fileReturn(){
        System.out.println("I want to keep playing golf, Joann will file my taxes");
    }
}
