package at.ydd.learning.basics;

import java.util.Scanner;

public class Calander {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wähle einen Monat: ");
        String month = scan.nextLine();
        System.out.println("Wähle einen Starttag: ");
        int startday = scan.nextInt();
        System.out.println("Monat: " + month + " Starttag: " + startday);
        int[] length = new int[31];
        int day = 0;
        int dayfor = day - 2 * day;


        boolean finished = false;

        while (!finished) {

            switch (month) {

                case "Januar", "März", "Mai", "Juli", "August", "Okotber", "Dezember":
                    System.out.println("Der Monat " + month + " hat 31 Tage!");

                    switch (startday) {
                        case 1, 3, 5, 7, 8, 10, 12:
                            for (int i = 0; i < 31; i++) {
                                length[i] = i + 1;
                                ;
                            }
                            break;

                        case 2, 4, 6, 9, 11:
                            System.out.println("Der Monat " + month + " hat 30 Tage!");
                            for (int i = 0; i < 30; i++) {
                                length[i] = i + 1;

                            }
                            break;

                    }
                    System.out.println("|MO|" + "|DI|" + "|MI|" + "|DO|" + "|FR|" + "|SA|" + "|SO|");
                    for (int i = dayfor; i < length.length + day; i++) {

                        if (i < 0) {
                            {
                                System.out.print("|" + "00" + "|");
                            }
                        } else {
                            if (i == 6 - day || i == 13 - day || i == 20 - day || i == 27 - day) {
                                if (i < 9) {
                                    System.out.print("|" + "0" + length[i] + "| \n");
                                } else {
                                    System.out.print("|" + length[i] + "| \n");
                                }
                            } else {
                                if (i < 9) {
                                    System.out.print("|" + "0" + length[i] + "|");
                                } else {
                                    System.out.print("|" + length[i] + "|");
                                }
                            }
                        }
                    }
                    finished = true;
            }


        }
    }
}

