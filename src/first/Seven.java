package first;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Fibonacci Series is 0");
        } else if (num == 2) {
            System.out.println("Fibonacci Series is 0, 1");
        } else {

            int num1 = 0;
            int num2 = 1;
            int num3 = 1;

            StringBuilder answer = new StringBuilder();

            for (int i = 3; i <= num; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

               answer.append(",").append(num3).append(" ");
            }

            System.out.println("Fibonacci Series is 0, 1, " + answer);
        }
    }
}
