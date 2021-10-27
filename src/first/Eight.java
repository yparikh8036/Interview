package first;

// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        Integer num = scanner.nextInt();
        int temp1 = num;
        String temp2 = "";

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            temp2 = temp2 + temp1 % 10;
            temp1 = temp1 / 10;
        }

        if (String.valueOf(num).equals(temp2)) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
