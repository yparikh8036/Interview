package first;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal");
        Long principal = scanner.nextLong();

        System.out.println("Enter time");
        Long time = scanner.nextLong();

        System.out.println("Enter rate");
        Long rate = scanner.nextLong();

        long interest = (principal * time * rate) / 100;

        System.out.println("Simple Interest = " + interest);
    }
}
