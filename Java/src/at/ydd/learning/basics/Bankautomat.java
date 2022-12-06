package at.ydd.learning.basics;

import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {

        System.out.println
                ("Selektieren Sie die gewünschte Funktion:" +
                                "\n" + " 1. Einzahlen" +
                                "\n" + " 2. Abheben" +
                                "\n" + " 3. Kontostand" +
                                "\n" +" 4. Beenden");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        System.out.println(selection);
        boolean isFinished = false;
        int balance = 0;



        while (!isFinished) {
            if (selection == 1) {
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("Sie haben " + deposit + " Euro eingezahlt!");
            }

            selection = scanner.nextInt();

            if (selection == 2) {
                System.out.println("Wie viel würden Sie gerne abheben?");
                int withdrawl = scanner.nextInt();
                if (balance >= withdrawl){
                System.out.println("Sie haben " + withdrawl + " Euro abgehoben!");
                balance -= withdrawl;
            }else {System.out.println("Ihr Kontostand ist zu gering!");}
            }else if (selection == 3){
                System.out.println("Ihr Kontostand beträgt " + balance + " Euro!");
            }else if (selection == 4){
                isFinished = true;
                System.out.println("Machine is stopping!");
            }else{
                System.out.println("Wrong Input!" + "\n" + "Please Choose a Number from 1-4!");
            }
        }
    }
}
