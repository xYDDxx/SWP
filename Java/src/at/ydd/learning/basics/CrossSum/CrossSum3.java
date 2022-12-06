package at.ydd.learning.basics.CrossSum;

public class CrossSum3 {

    public static int[] AllCrossSums = new int[CrossSumCalculation(false) + 1];

    public static void main(String[] args) {
        //Welche der Quersummen bei den Zahlen von 0 - 1000 kommt am häufigsten vor? Gib diese aus.

        CrossSumCalculation(true);
        int tallestCrossSum1 = 0;
        int tallestCrossSum2 = 0;
        int biggestCrossSum = 0;

        for (int i = 0; i < AllCrossSums.length; i++) {
            if (AllCrossSums[i] == biggestCrossSum)
                tallestCrossSum2 = i;
            if (AllCrossSums[i] > biggestCrossSum) {
                tallestCrossSum1 = i;
                biggestCrossSum = AllCrossSums[i];
            }
            //System.out.println(i + ": " + AllCrossSums[i]);
        }

        System.out.println();
        if (tallestCrossSum1 == tallestCrossSum2 || tallestCrossSum2 == 0)
            System.out.println("tallest Cross Sum: " + tallestCrossSum1);
        else
            System.out.println("Biggest Cross-Sums: " + tallestCrossSum1 + ", " + tallestCrossSum2);
        System.out.println("Biggest Addition: " + biggestCrossSum);
    }

    public static int CrossSumCalculation(boolean secondTry) {
        int tallestCrossSum = 0;
        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp /= 10;
            }
            if (crossSum > tallestCrossSum) tallestCrossSum = crossSum;
            if (secondTry) AllCrossSums[crossSum]++;
        }
        return tallestCrossSum;
    }
}
