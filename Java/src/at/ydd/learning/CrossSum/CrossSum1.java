package at.ydd.learning.CrossSum;

public class CrossSum1 {
    public static void main(String[] args) {
        for (int num = 0; num < 1000; num++) {
            String NumberAsString = Integer.toString(num);
            char[] numbers = NumberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }
            if (sum==15){
                System.out.println(sum);
            }
        }
    }
}
