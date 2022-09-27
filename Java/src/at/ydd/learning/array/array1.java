package at.ydd.learning.array;

public class array1 {
    public static void main(String[] args) {

        int[] data = {9,5,84,6,21,7,1,5,84,3};



        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println(sum);


    }
}
