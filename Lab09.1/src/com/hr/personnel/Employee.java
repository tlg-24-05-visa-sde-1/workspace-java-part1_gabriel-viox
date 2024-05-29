/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
// an ABSTRACT class has one or more ABSTRACT methods
public abstract class Employee implements TaxPayer {
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {
        super();
    }

    public Employee(String name, LocalDate hireDate) {
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    // all employees work
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    // all employees get paid -> they have this behavior in common, so pay() must go here
    // the problem is that we can't really implement here, to come up with a $$$ figure
    // abstract did not work for me, must correct

    // we need a way to say "all employees get paid"
    // but we cannot implement, all we have is a name and hireDate
    // So we say "that" all employees get paid, but we don't say how
    public abstract void pay();

    public abstract void payTaxes();
    
    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name =" + getName() + ", hireDate =" + getHireDate();
    }
}