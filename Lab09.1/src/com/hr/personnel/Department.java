/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

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
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;  // for dealing with the array

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
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
    }

    // method to pay employee
    public void payEmployees(){
        for (int i = 0; i < currentIndex; i++){
            employees[i].pay();
        }
    }

    /*
     * for all employees that take vacation, make them do "this"
     * this would be for SalariedEmployees, only
     */
    public void holidayBreak(){
        for (int i = 0; i < currentIndex; i++){
            // if employee[i] is referring to Salaried Employee object,
            // "downcast" the employee reference to more specific type of SalariedEmployee
            // then we can call Salaried employee-specific methods like takeVacation()
            if(employees[i] instanceof SalariedEmployee) {
                ((SalariedEmployee) employees[i]).takeVacation(); // downcast-and-method-call in one shot

                // explicitly creates a NEW reference of type SalariedEmployee (semp)
//                SalariedEmployee semp = (SalariedEmployee) employees[i];
//                semp.takeVacation();
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