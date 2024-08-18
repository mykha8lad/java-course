package JAVA_HW_Module_01;

import java.util.Random;

/** Есть одномерный массив, заполненный случайными
 числами. На основании данных этого массива нужно:
 ■ Создать одномерный массив, содержащий только
 четные числа из первого массива;
 ■ Создать одномерный массив, содержащий только
 нечетные числа из первого массива;
 ■ Создать одномерный массив, содержащий только
 отрицательные числа из первого массива;
 ■ Создать одномерный массив, содержащий только
 положительные числа из первого массива. */

public class ExerciseTen {
    public static void main(String[] args) {
        Random random = new Random();

        int[] originalArray = new int[20];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(201) - 100;
        }

        int maxSize = originalArray.length;

        int[] evenNumbers = new int[maxSize];
        int[] oddNumbers = new int[maxSize];
        int[] negativeNumbers = new int[maxSize];
        int[] positiveNumbers = new int[maxSize];

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenNumbers[evenCount++] = num;
            } else {
                oddNumbers[oddCount++] = num;
            }

            if (num < 0) {
                negativeNumbers[negativeCount++] = num;
            } else if (num > 0) {
                positiveNumbers[positiveCount++] = num;
            }
        }

        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nEven Numbers Array:");
        printArray(evenNumbers, evenCount);

        System.out.println("\nOdd Numbers Array:");
        printArray(oddNumbers, oddCount);

        System.out.println("\nNegative Numbers Array:");
        printArray(negativeNumbers, negativeCount);

        System.out.println("\nPositive Numbers Array:");
        printArray(positiveNumbers, positiveCount);
    }

    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        printArray(array, array.length);
    }
}
