package JAVA_HW_Module_01;

import java.util.Scanner;

/** Пользователь вводит шестизначное число. Необходимо
 поменять в этом числе первую и шестую цифры, а также
 вторую и пятую цифры. */

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a six-digit number: ");
            input = scanner.nextLine();

            if (input.length() != 6) {
                System.out.println("Please enter a valid six-digit number.");
            }
        } while (input.length() != 6);

        char[] digits = input.toCharArray();

        char temp = digits[0];
        digits[0] = digits[5];
        digits[5] = temp;

        temp = digits[1];
        digits[1] = digits[4];
        digits[4] = temp;

        String resultNumber = new String(digits);

        System.out.println("Result: " + resultNumber);
    }
}
