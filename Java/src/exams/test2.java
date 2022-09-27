package exams;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        boolean isfinished = false;
        Random random = new Random();
        int randomNumber = 0;
        int sum = 0;

        while (!isfinished){
            randomNumber = random.nextInt(10);
            sum += randomNumber;
            if (randomNumber == 5) {
                isfinished = true;
            };
        }
        System.out.println("The sum of the random numbers are " + sum);

    }
}
