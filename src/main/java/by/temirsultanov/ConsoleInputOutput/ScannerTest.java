package by.temirsultanov.ConsoleInputOutput;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input a number: ");
        int num = sc.nextInt();

        System.out.printf("Your  number: %d \n", num);
        sc.close();

    }
}
