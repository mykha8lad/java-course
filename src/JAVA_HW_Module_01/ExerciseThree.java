package JAVA_HW_Module_01;

import java.util.Scanner;

/** Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. */

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter the second digit: ");
        int digit2 = scanner.nextInt();

        System.out.print("Enter the third digit: ");
        int digit3 = scanner.nextInt();

        int resultNumber = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("Result: " + resultNumber);
    }
}
