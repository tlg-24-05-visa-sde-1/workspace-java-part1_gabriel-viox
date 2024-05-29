package misc.test;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 29;
        System.out.println("Age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("Population is: " + population);

        double temperature = 78.5;
        System.out.println("Temperature is: " + temperature);

        boolean isCloudy = true;
        System.out.println("isCloudy is: " + isCloudy);

        char grade = 'A';
        System.out.println("Grade is: " + grade);

        String size = "L";
        System.out.println("Size is: " + size);

        System.out.println();

        //primitive types are value types

        int x = 3;
        System.out.println("x is: " + ++x);
        // ++ increments by 1
        // -- decreases by 1

        int a = 5;
        int b = a;
        a++;
        // b is its own 5
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);

    }
}