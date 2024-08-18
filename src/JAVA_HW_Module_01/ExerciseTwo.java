package JAVA_HW_Module_01;

import java.util.Scanner;

/** Пользователь вводит с клавиатуры два числа. Первое
 число — это значение, второе число процент, который
 необходимо посчитать. */

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        double number = scanner.nextInt();

        System.out.print("Enter percent: ");
        double percent = scanner.nextInt();

        System.out.println("Percentage of the whole: " + (percent / 100) * number);
    }
}
