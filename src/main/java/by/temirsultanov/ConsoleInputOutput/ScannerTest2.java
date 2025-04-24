package by.temirsultanov.ConsoleInputOutput;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input name: ");
        String name = sc.nextLine();
        System.out.printf("Input age: ");
        int age = sc.nextInt();
        System.out.printf("Input height: ");
        float height = sc.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        sc.close();
    }
}
