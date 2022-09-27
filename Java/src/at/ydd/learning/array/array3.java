package at.ydd.learning.array;

import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        int[] number = {8,3,2,22,8,1};

        Arrays.parallelSort(number, 0, 6);

        for (int i : number) {
            System.out.print(i);
        }

    }
}
