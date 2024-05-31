package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    private static final double STANDARD_DEDUCTION = 200000;

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

    @Override
    public double getStandardDeduction(){
        return STANDARD_DEDUCTION;
    }
}
