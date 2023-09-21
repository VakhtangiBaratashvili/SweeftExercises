package Exercise_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int count = scanner.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter the number: ");
            nums[i] = scanner.nextInt();
        }
    }

    public static int notContains(int[] array) {
        int i = 1;
        while (true) {
            if (!isInArray(array, i)) {
                return i;
            }
            if (i == Integer.MAX_VALUE) {
                break;
            }
            i++;
        }
        return 0;
    }

    public static boolean isInArray(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
