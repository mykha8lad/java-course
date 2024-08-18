package JAVA_HW_Module_01;

import java.util.Scanner;

/** Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
 переводит метры в мили, дюймы или ярды. */

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;
        int choice;

        do {
            System.out.print("Enter the number of meters: ");
            meters = scanner.nextDouble();
        }while(meters <= 0);

        do{
            System.out.println("Choose the unit to convert to:");
            System.out.println("1 - Miles");
            System.out.println("2 - Inches");
            System.out.println("3 - Yards");

            choice = scanner.nextInt();
            double result = 0;
        }while(choice < 1 || choice > 3);

        double result;
        switch (choice) {
            case 1:
                result = meters * 0.000621371;  // Перевод в мили
                System.out.println(meters + " meters is " + result + " miles.");
                break;
            case 2:
                result = meters * 39.3701;  // Перевод в дюймы
                System.out.println(meters + " meters is " + result + " inches.");
                break;
            case 3:
                result = meters * 1.09361;  // Перевод в ярды
                System.out.println(meters + " meters is " + result + " yards.");
                break;
        }
    }
}
