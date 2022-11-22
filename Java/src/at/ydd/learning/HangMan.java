package at.ydd.learning;

import java.util.Random;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        boolean stop = false;
        boolean guess = false;
        String[] words = {"Mathematik", "Programmieren", "Stegosaurus", "Giraffe", "Muesli", "Schneeflocke", "Domino", "Aequator", "Scheibenkaese", "Baumwolle", "Ziegelfabrik", "Senerei", "Metzgerei", "Mettigel", "Pansexuell", "Erotisch"};
        System.out.println("Das gesuchte Wort sieht wie folgt aus:");

        Random random = new Random();
        int rndNum = random.nextInt(0, words.length);
        String word = words[rndNum];

        char[] wordChar = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordChar[i] = word.charAt(i);
        }

        for (int i = 0; i < wordChar.length; i++) {
            System.out.print(wordChar[i] = '*');
        }
        System.out.println("");

        while (!stop) {
            System.out.println("Welcher Buchstabe könnte im Wort stecken?");
            Scanner scanner = new Scanner(System.in);
            char selection = scanner.next().charAt(0);


            for (int i = 0; i < words.length; i++) {

            }
                for (int i = 0; i < wordChar.length; i++) {
                    if (selection == wordChar[i]) {
                        guess = true;
                    } else {
                        guess = false;
                    }
                }


            if (guess) {
                System.out.println("Super! Der gewählte Buchstabe war richtig");
                System.out.println("Das Wort sieht jetzt wie folgt aus:");
            } else if (!guess){
                System.out.println("Der gewählte Buchstabe ist nicht im Wort enthalten!");
            }


        }

    }
}
