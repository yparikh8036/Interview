package first;

// 1. Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class FirstSolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number Is Even");
        } else {
            System.out.println("Number Is Odd22");
        }
    }
}
