package at.ydd.learning;
import java.util.Random;

public class while1 {
    public static void main(String[] args) {

        boolean isfinished = false;
        int sum = 0;
        Random random = new Random();
        int randomNumber = 0;
        while (!isfinished){
            randomNumber = random.nextInt(10,30);
                sum += randomNumber;
            if (randomNumber == 15 || randomNumber == 25) {
                isfinished = true;
            };
        }

        System.out.println(sum);
    }
}
