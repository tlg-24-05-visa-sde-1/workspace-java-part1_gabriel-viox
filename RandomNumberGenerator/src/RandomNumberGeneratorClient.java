import java.util.Random;

public class RandomNumberGeneratorClient {
    public static void main(String[] args){
        int number = new Random().nextInt(1000);
        System.out.println(number);
    }
}
