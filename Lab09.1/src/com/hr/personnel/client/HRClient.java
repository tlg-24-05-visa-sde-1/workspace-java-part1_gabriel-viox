/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2000.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 30, 30));

        dept.addEmployee(new HourlyEmployee("Mike", LocalDate.of(1990, 8, 24), 25.0, 25.0));
        dept.addEmployee(new SalariedEmployee("John", LocalDate.of(2010, 4, 6), 1500));

        dept.addEmployee(new Executive("Gail", LocalDate.of(1900, 1, 1), 1700000));
        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Pay the employees
        System.out.println("\nPay all employees");
        dept.payEmployees();

        // Take Vacation
        System.out.println("\nTake a vacation:");
        dept.holidayBreak();

        // Executive's job
        System.out.println("\nDoing what it do");


    }
}