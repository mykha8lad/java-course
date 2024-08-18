package JAVA_HW_Module_01;

import java.util.Scanner;

/** Пользователь вводит с клавиатуры номер месяца (от
 1 до 12). В зависимости от полученного номера месяца
 программа выводит на экран надпись: Winter (если введено
 значение 1,2 или 12), Spring (если введено значение от 3
 до 5), Summer (если введено значение от 6 до 8), Autumn
 (если введено значение от 9 до 11). */

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;

        do {
            System.out.print("Enter a month number (1-12): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next();  // Считываем некорректный ввод
                System.out.print("Enter a month number (1-12): ");
            }
            month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Please enter a valid month number between 1 and 12.");
            }
        } while (month < 1 || month > 12);

        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else {
            season = "Autumn";
        }

        System.out.println("Season: " + season);
    }
}
