package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    // A superclass constructor is always called - ALWAYS
    // Constructors
    public SalariedEmployee(){
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass constructor

        // registerIn401K()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // delegate to neighboring constructor, which handles name, hireDate
        setSalary(salary);  // handle salary myself, by delegating to its setter
    }

    // Business/Action methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid a salary of " + getSalary() + " per week");
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation");
    }


    //getter and setter
    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        return this.salary = salary;
    }

    @Override //make this a habit
    public String toString(){
        return super.toString() + " salary: "+ getSalary();
    }

    @Override
    public void payTaxes() {
        System.out.println(getName()+ " paid taxes of " + ( getSalary() * SALARIED_TAX_RATE));
    }
}
