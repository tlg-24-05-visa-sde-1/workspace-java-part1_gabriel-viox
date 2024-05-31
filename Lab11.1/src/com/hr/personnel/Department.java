/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private Collection<Employee> employees = new ArrayList<>();


    // constructors
    public Department() {
        super();
    }

    public Department(String name, String location) {
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for (Employee emp : employees){
            System.out.println(emp); // toString() Automatically
        }
    }

    public void workEmployees() {
        for (Employee emp : employees){
            emp.work(); // toString() Automatically
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // method to pay employee
    public void payEmployees(){
        for (Employee emp : employees){
            emp.pay(); // toString() Automatically
        }
    }

    /*
     * for all employees that take vacation, make them do "this"
     * this would be for SalariedEmployees, only
     */
    public void holidayBreak(){
        for (Employee emp : employees){
            // if emp is referring to Salaried Employee object,
            // "downcast" the employee reference to more specific type of SalariedEmployee
            // then we can call Salaried employee-specific methods like takeVacation()
            if(employees instanceof SalariedEmployee) {
                //((SalariedEmployee) employees[i]).takeVacation(); // downcast-and-method-call in one shot

                // explicitly creates a NEW reference of type SalariedEmployee (semp)
                SalariedEmployee semp = (SalariedEmployee) employees;
                semp.takeVacation();
            }
        }
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department: name= " + getName() + ", location= " + getLocation();
    }
}