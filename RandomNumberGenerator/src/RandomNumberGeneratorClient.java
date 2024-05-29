import java.util.Random;

public class RandomNumberGeneratorClient {
    public static void main(String[] args){
        int number = new Random().nextInt(100);
        System.out.println(number);
    }
}
