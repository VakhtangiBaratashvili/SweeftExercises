package Exercise_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int stairs = scanner.nextInt();
        System.out.println(countVariants(stairs));
    }

    public static int countVariants(int stairsCount) {
        if (stairsCount <= 2) {
            return stairsCount;
        }
        int[] fibArr = new int[stairsCount + 1];
        fibArr[1] = 1;
        fibArr[2] = 2;

        for (int i = 3; i <= stairsCount; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        return fibArr[stairsCount];
    }
}
