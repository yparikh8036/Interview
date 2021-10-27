package first;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one");
        Long one = scanner.nextLong();

        System.out.println("Enter number two");
        Long two = scanner.nextLong();

        System.out.println("Enter operator (+, -, *, /) ");
        String operator = scanner.next();

        long answer = 0;

        if (operator.equals("+")) {
            answer = one + two;
        } else if (operator.equals("-")) {
            answer = one - two;
        } else if (operator.equals("*")) {
            answer = one * two;
        } else if (operator.equals("/")) {
            answer = one / two;
        } else {
            System.out.println("Invalid operator");
        }

        System.out.println("Answer = " + answer);
    }

}
