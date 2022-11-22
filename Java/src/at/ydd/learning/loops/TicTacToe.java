package at.ydd.learning.loops;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        boolean gamestop = false;
        String[][] playGround = new String[3][3];
        System.out.println("Grid:");
        String type = "-";
        int counter = 1;
        String winner = "";

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                playGround[x][y] = "-";
            }
        }

        while (!gamestop) {
            for (int rows = 0; rows < playGround.length; rows++) {
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(playGround[rows][j]);
                    }
                    System.out.println("");
                }
            }
            counter += 1;

            if (counter % 2 == 0) {
                type = "x";
            } else {
                type = "o";
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie Ihr gewünschtes Feld, in der Form x,x mit Zahlen von 0-2 ein: ");


            String inputRaw = scanner.next();
            String[] input = inputRaw.split(",");
            int[] inputInt = new int[2];
            for (int i = 0; i < input.length; i++) {
                inputInt[i] = Integer.parseInt(input[i]);
            }

            int x = inputInt[0];
            int y = inputInt[1];


            if (playGround[x][y] == "-") {
                playGround[x][y] = type;
            } else {
                System.out.println("Diese Feld ist schon besetzt!");
                counter = counter-1;
            }

            for (int i = 0; i < 3; i++) {
                if (playGround[i][0]==(playGround[i][1]) && playGround[i][0]==(playGround[i][2]) && playGround[i][0]!=("-")) {
                    gamestop = true;
                    winner = playGround[i][1];
                }
            }

            for (int i = 0; i < 3; i++) {
                if (playGround[0][i]==(playGround[1][i]) && playGround[0][i]==(playGround[2][i]) && playGround[0][i]!=("-")) {
                    gamestop = true;
                    winner = playGround[1][i];
                }
            }

            if (playGround[0][0]==(playGround[1][1]) && playGround[0][0]==(playGround[2][2]) && playGround[0][0]!=("-")) {
                gamestop = true;
                winner = playGround[0][0];
            }

            if (playGround[2][0]==(playGround[1][1]) && playGround[2][0]==(playGround[0][2]) && playGround[0][2]!=("-")) {
                gamestop = true;
                winner = playGround[2][0];
            }



        }
        if (gamestop){
            for (int rows = 0; rows < playGround.length; rows++) {
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(playGround[rows][j]);
                    }
                    System.out.println("");
                }
            }
        System.out.println(" the winner is whoever picked " + winner);}

    }

}



