package at.ydd.learning.CrossSum;

import java.util.Scanner;

public class CrossSum4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        boolean isfinished = false;

        while (!isfinished) {
            String NumberAsString = Integer.toString(num);
            char[] numbers = NumberAsString.toCharArray();

            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }
            num = sum;
            sum = 0;

            System.out.println(num);

            if (num < 10) {
                isfinished = true;
            }

        }
    }
}
