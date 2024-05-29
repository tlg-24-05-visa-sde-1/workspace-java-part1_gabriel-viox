package com.hr.personnel;

import java.time.LocalDate;
//a subclass cannot be final class

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;


    // A superclass constructor is always called - ALWAYS
    //Constructor
    public HourlyEmployee(){
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate) {
        this(name, hireDate);   // delegate to superclass constructor, which handles name, hireDate
        setRate(rate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);    // delegate to neighboring constructor, which handles name, hireDate
        this.rate = rate;       // handle salary myself, by delegating to its setter
        setHours(hours);
    }

    // Business/Action methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly wage of " + (rate * hours) + " per week");
    }


    // Getters and Setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override // method is here to replace an inherited one
    public String toString(){
        return super.toString() + " rate: " + getRate() + " hours: " + getHours();
    }
}
