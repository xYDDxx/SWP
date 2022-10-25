package at.ydd.learning.loops;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihr gewünschtes Feld ein: ");
        String inputRaw = scanner.next();
        String[] input = inputRaw.split(",");
        int[] inputInt = new int[2];
        for (int i = 0; i < input.length; i++) {
            inputInt[i] = Integer.parseInt(input[i]);
        }

        int[][] playGround = new int[3][3];

        for (int i = 0; i < input.length; i++) {
            playGround[i][i] = inputInt[i];
        }


        for (int rows = 0; rows < playGround.length; rows++) {
            for (int cols = 0; cols < playGround.length; cols++) {
                System.out.println(playGround[rows][cols]);
            }

        }

    }

}
