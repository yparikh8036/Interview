package first;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one");
        long one = scanner.nextLong();

        System.out.println("Enter number two");
        long two = scanner.nextLong();

        if (one > two) {
            System.out.println("First is Large");
        } else {
            System.out.println("Two is Large");
        }
    }
}
