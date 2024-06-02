package org.math;
//import  static java.lang.Math.*;

import java.util.Collection;
import java.util.List;

class Calculator {
    /*
     * Returns avergae of supplied Integers
     */

    //collections can only store objects
    public static int findMin(List<Integer> values){
        // pretend it was (5,7,1)
        int smallest = values.get(0);

        //for each integer value in values
        for (Integer value: values) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }


    public static double average(int first, int... rest){
        double result = 0.0;

        // gets you the sum of the int in the array
        int sum = first;
        for(int value : rest){
            sum += value; // sum = sum + value

        }
        result = (1.0 * sum) /(rest.length + 1);
        return result;

    }


    //add(), subtract()
    public static double add(double a, double b){
        return a+b;
    }
    // a and b are local to this method
    public static double subtract(double a, double b){
        return a-b;
    }
    /*
     * Indicates if the supplied integer is even or not
     */
    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static int randomInt(int min, int max){
        int result = 0;
        double rand = Math.random();                             // 0.00000 to .9999999
        double scaled = (rand* (max-min + 1) + min );      // 0.00000 to 14.999999
        result = (int)scaled;
        return result;
    }
    public int randomInt(int max){
        return randomInt(1, max);
    }

    /*
     * returns a random integer between 1 and 16 (inclusive)
     *
     * HINT: see a class called Math (in java.lang) look for a method here.
     * NOTE: these are methods are all static, which means you call them as followed
     * Math.methodName
     */
    public static int randomInt(){
        return randomInt(1, 16);
    }


//    double randomInt(){
//        double result = Math.random();
//        return result;
//    }
}