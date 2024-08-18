package JAVA_HW_Module_01;

import java.util.Scanner;

/** Показать на экран таблицу умножения в диапазоне,
 указанном пользователем.  */

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        for (int i = number1; i <= number2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println("\n");
        }
    }
}
