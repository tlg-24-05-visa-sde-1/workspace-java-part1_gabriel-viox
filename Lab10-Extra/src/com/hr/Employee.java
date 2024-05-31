package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try-catch and throw a different exception at the client.
     * NOTE: we will "wrap: the DestinationUnreachableException into a new WorkException
     */
    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Rivian","R1T");

        try {
            c.start();
            c.moveTo("North Austin");
        }
        catch (DestinationUnreachableException e) {
            // insert this exception into a new WorkException
            throw new WorkException("Unable to get to work", e); // e is the 'cause'
        }
        finally {
            c.stop();
        }
    }


    /*
     * OPTION 3: try-catch, "react in some way," and then re-throw back at the client.
     */

//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("ABC123", "Rivian","R1T");
//
//        try {
//            c.start();
//            c.moveTo("North Austin");
//        }
//        catch (DestinationUnreachableException e) {
//            System.out.println("Emailing Lisa to complain");
//           throw e; // toString() automatically called
//        }
//        finally {
//            c.stop();
//        }
//    }

    /*
     * OPTION 2: "punt" i.e.., DON'T catch the exception at all, just ignore it.
     * Note: We use a try-finally, to guarantee that c.stop() is always called, BUT
     * we're still punting because there's no catch.
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("ABC123", "Rivian","R1T");
//
//        try {
//            c.start();
//            c.moveTo("North Austin");
//        }
//        finally {
//            c.stop();
//        }
//    }



    /*
     * OPTION 1: try catch and "handle" in some way, so the exception stops here.
     * Note that we put the call to c.stop in a finally block, to guarantee that it's called.
     */
//   public void goToWork() {
//        Car c = new Car("ABC123", "Rivian","R1T");
//
//        try {
//            c.start();
//            c.moveTo("North Austin");
//        }
//        catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage()); // toString() automatically called
//        }
//        finally {
//            c.stop();
//        }
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}