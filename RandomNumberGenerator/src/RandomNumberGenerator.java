
// import the Random class from java.util
import java.util.Random;
public class RandomNumberGenerator {

    public static void main(String[] args) {
        Random d20 = new Random();
        int number;

        //This method generates a random number and does it 1000 times.
        for (int count = 0; count < 1000; count++) {
            // adding 1+ shifts the range to 1 and 20 (inclusive)
            number = 1+d20.nextInt(20);
            // prints the number.
            System.out.println(number);
        }
    }
}