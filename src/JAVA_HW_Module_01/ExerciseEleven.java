package JAVA_HW_Module_01;

import java.util.Scanner;

/** Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
 Метод принимает в качестве параметра: длину линии,
 направление, символ. */

public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        char direction, symbol;

        do {
            System.out.print("Enter length of the line: ");
            length = scanner.nextInt();

            System.out.print("Enter direction of the line (H for horizontal, V for vertical): ");
            direction = scanner.next().toUpperCase().charAt(0);

            System.out.print("Enter the symbol to draw the line: ");
            symbol = scanner.next().charAt(0);
        }while(length < 1 || (direction != 'H' && direction != 'V') ||   symbol == ' ');

        drawLine(length, direction, symbol);
    }

    public static void drawLine(int length, char direction, char symbol) {
        if (direction == 'H') {
            // Отображаем горизонтальную линию
            for (int i = 0; i < length; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println(); // Переход на новую строку после горизонтальной линии
        } else if (direction == 'V') {
            // Отображаем вертикальную линию
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid direction. Use 'H' for horizontal or 'V' for vertical.");
        }
    }
}
