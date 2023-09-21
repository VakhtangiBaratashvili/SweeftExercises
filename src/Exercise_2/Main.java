package Exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        int amount = scanner.nextInt();
        System.out.println(minSplit(amount));
    }

    public static int minSplit(int amount) {
        int fifty = amount / 50;
        int twenty = (amount - fifty * 50) / 20;
        int ten = ((amount - fifty * 50) - (twenty * 20)) / 10;
        int five = ((amount - fifty * 50) - (twenty * 20) - (ten * 10)) / 5;
        int one = ((amount - fifty * 50) - (twenty * 20) - (ten * 10) - (five * 5));
        return fifty + twenty + ten + five + one;
    }
}
