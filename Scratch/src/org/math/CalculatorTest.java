package org.math;

class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;

        // call org.math.Calculator.randomInt(5,20) 1,000,000 times
        // if it ever comes back < 5 or > 20, we know it doesn't work
        for (int i = 0; i < 100_000_000; i++) {
            int result = Calculator.randomInt(5,20);
            if(result < 5 || result > 20 ){
                isCorrect = false;
                break;
            }
        }


        if (isCorrect) {
            System.out.println("It works!");
        }
        else {
            System.out.println("It doesn't work!");
        }
    }
}