package at.ydd.learning.basics.CrossSum;

public class CrossSum2 {
    public static void main(String[] args) {
        for (int num = 0; num < 1000; num++) {
            String NumberAsString = Integer.toString(num);
            char[] numbers = NumberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }
            int rest = sum % 7;
            if (rest==0){
                System.out.println(sum);
            }
    }
    }
}
