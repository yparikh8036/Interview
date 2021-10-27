package first;

// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        Integer num = scanner.nextInt();
        int temp1 = num;
        int temp2 = 0;

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            int temp = temp1 % 10;
            temp1 = temp1 / 10;
            temp2 = (int) (temp2 + Math.pow(temp, 3));
        }

        if (num == temp2) {
            System.out.println("Number is Armstrong Number");
        } else {
            System.out.println("Number is not Armstrong Number");
        }
    }
}
