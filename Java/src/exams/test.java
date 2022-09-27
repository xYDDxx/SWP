package exams;
import java.util.Random;

public class test {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(1000);
        System.out.println("Random Number 1: " + randomNumber1);

        int randomNumber2 = random.nextInt(randomNumber1);
        System.out.println("Random Number 2: " + randomNumber2);

        for (int i=randomNumber1; i>=randomNumber2; i--) {
            System.out.println(i);
        }
    }
    }

