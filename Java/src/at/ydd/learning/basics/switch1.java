package at.ydd.learning.basics;

import java.util.Random;

public class switch1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5,10);
        System.out.println(randomNumber);

        switch (randomNumber) {
            case 10:
            System.out.println("Ten");
            break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Fife");
                break;
        }
    }
}

