package at.ydd.learning;

public class loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 1000; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
