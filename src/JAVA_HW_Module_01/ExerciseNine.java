package JAVA_HW_Module_01;

import java.util.Random;

/** В одномерном массиве, заполненном случайными
 числами, определить минимальный и максимальный
 элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов, посчитать количество нулей. */

public class ExerciseNine {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        int minNumber = array[0];
        int maxNumber = array[0];
        int negativeCountNumber = 0;
        int positiveCountNumber = 0;
        int zeroCountNumber = 0;

        // Определяем минимум и максимум
        for (int num : array) {
            if (num < minNumber) {
                minNumber = num;
            }
            if (num > maxNumber) {
                maxNumber = num;
            }

            // Подсчитываем количество отрицательных, положительных и нулевых элементов
            if (num < 0) {
                negativeCountNumber++;
            } else if (num > 0) {
                positiveCountNumber++;
            } else {
                zeroCountNumber++;
            }
        }

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println("Minimum element: " + minNumber);
        System.out.println("Maximum element: " + maxNumber);
        System.out.println("Number of negative elements: " + negativeCountNumber);
        System.out.println("Number of positive elements: " + positiveCountNumber);
        System.out.println("Number of zeros: " + zeroCountNumber);
    }
}
