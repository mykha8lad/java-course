package JAVA_HW_Module_01;

import java.util.Scanner;

/** Пользователь вводит с клавиатуры два числа. Нужно
 показать все нечетные числа в указанном диапазоне. Если
 границы диапазона указаны неправильно требуется произвести нормализацию границ. */

public class ExerciseSeven {
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

        System.out.print("Odd numbers in the range: ");
        for (int i = number1; i <= number2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
