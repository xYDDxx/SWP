package at.ydd.learning.basics.array;

import java.util.Random;

public class array2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumber = new int[50];

        int sum = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            int number = random.nextInt(100);
            randomNumber[i] = number;
            sum += number;

        }
        System.out.println(sum);

        for (int i = 0; i < randomNumber.length; i++) {
            System.out.println(randomNumber[i]);
        }
    }
}
