package Exercise_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String a = scanner.nextLine();
        System.out.print("Enter Second binary number: ");
        String b = scanner.nextLine();

        binarySum(binaryToDecimal(a) + binaryToDecimal(b));
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int size = binary.length();

        for (int i = 0; i < size; i++) {
            if (binary.charAt(i) == '1') {
                decimal += (int) Math.pow(2,size - (i + 1));
            }
        }
        return decimal;
    }

    public static void binarySum(int decimal) {
        if (decimal == 0 || decimal == 1) {
            System.out.print(decimal);
            return;
        }
        binarySum(decimal / 2);
        System.out.print(decimal % 2);
    }
}

