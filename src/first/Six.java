package first;

// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();

        System.out.println(num + " in USD is $" + num/70);
    }
}
