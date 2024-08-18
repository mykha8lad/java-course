package JAVA_HW_Module_01;

import java.util.Arrays;
import java.util.Scanner;

/** Напишите метод, сортирующий массив по убыванию
 или возрастанию в зависимости от выбора пользователя. */

public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Enter size of the array: ");
        do{
            size = scanner.nextInt();
        }while(size < 1);
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Ввод направления сортировки
        System.out.print("Enter 'A' for ascending or 'D' for descending: ");
        char order = scanner.next().toUpperCase().charAt(0);

        if (order == 'A') {
            Arrays.sort(array);
        } else if (order == 'D') {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Invalid order. Use 'A' for ascending or 'D' for descending.");
            return;
        }

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
