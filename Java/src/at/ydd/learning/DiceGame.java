package at.ydd.learning;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        System.out.println
                ("Willkommen zum Würfelspiel!" +
                        "\n" + "Sie können 6-mal Würfeln" +
                        "\n" + "Gewürfelt wird mit der Eingabe 1" +
                        "\n" + "Ihr Gegner ist der Computer" +
                        "\n" + "Gewinner ist der, dessen Summe größer ist" +
                        "\n" + "Viel Glück!");

        Random random = new Random();
        int sumPlayer = 0;
        int sumBot = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();


        for (int i = 0; i <= 5; i++) {

            if (selection == 1) {
                int randomNumberPlayer = random.nextInt(1, 6);
                System.out.println("You rolled " + randomNumberPlayer);
                sumPlayer += randomNumberPlayer;
                System.out.println(5 - i + " more trys!");
                if (i == 5) {
                    System.out.println("Press 1 to see the Result!");
                }
            } else {
                System.out.println("Wrong Input!");
            }
            int randomNumberBot = random.nextInt(6);
            sumBot += randomNumberBot;
            selection = scanner.nextInt();
        }

        if (sumBot < sumPlayer) {
            System.out.println("You WON!");
        } else {
            System.out.println("You LOST!");
        }
        ;
        System.out.println("Your Sum: " + sumPlayer);
        System.out.println("Bots Sum: " + sumBot);
    }
}
