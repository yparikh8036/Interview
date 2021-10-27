package first;

// Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.next();

        System.out.println("Hello " + name);
    }
}
