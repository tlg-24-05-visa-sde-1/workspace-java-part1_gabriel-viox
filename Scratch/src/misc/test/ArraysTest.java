package misc.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
     int[] ages = new int[4];
     ages[0] = 7;
     ages[1] = 29;
     ages[2] = 50;
     ages[3] = 33;
     System.out.println(Arrays.toString(ages)); // toString() automatically called

     //iterate using the for each loop
     for (int age : ages) {
      System.out.println("The age is " + age);
     }
     System.out.println();


     double[] sizes = {1.1, 3.4, 11.1, 7.7};
     System.out.println(Arrays.toString(sizes));

     for (double size : sizes) {
      System.out.println("The size is " + size);
     }


     boolean[] statues = {true, false, true, false};
     System.out.println(Arrays.toString(statues));


     String[] names = {"Artemis", "Leo", "Bean", "Beaux"};
     System.out.println(Arrays.toString(names));

     // iterate using old-style index loop
     for ( int i = 0; i < names.length; i++ ) {
      System.out.println("The name is " + names[i]);
     }
    }
}