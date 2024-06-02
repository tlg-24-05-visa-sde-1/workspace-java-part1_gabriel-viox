package org.math;
import java.util.ArrayList;
import java.util.List;
//import static java.lang.Math.random;



class CalculatorClient {
    public static void main(String[] args) {
        // first you need a calculator object

        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(7);
        input.add(1);

        int smallest = Calculator.findMin(input);
        System.out.println("The smallest number is " + smallest);

        double sum = Calculator.add(17,10);
        System.out.println("Sum: " + sum);

        System.out.println("Diff: " + Calculator.subtract(10,17));

        boolean result = Calculator.isEven(9);
        System.out.println("Result: " + result);

        double randomNumber = Math.random() * 16;
        System.out.println("Random number: " + randomNumber);

        int winner = Calculator.randomInt(5, 20);
        System.out.println("Winner: " + winner);

        double avg= Calculator.average(3,5,10,13);
        System.out.println("Average result: " + avg);

    }


}