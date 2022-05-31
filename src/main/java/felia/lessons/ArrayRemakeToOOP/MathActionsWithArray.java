package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class MathActionsWithArray {
    int[] array = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};
    public static String fullArray;
    public static String multiplyNumbers;
    public static int sumArray;
    public static int sumOddNumbers;
    public static int sumEvenNumbers;

    public MathActionsWithArray() {
        this.fullArray = Arrays.toString(fullArray());
        this.multiplyNumbers = Arrays.toString(multiplyNumbers(array));
        this.sumArray = sumArray(array);
        this.sumOddNumbers = sumOddNumbers(array);
        this.sumEvenNumbers = sumEvenNumbers(array);
    }

    int[] fullArray() {
        int[] array1 = new int[8];
        for (int a = 0, j = 0; a < array1.length; a++, j += 3)
            array1[a] = j;
        return array1;
    }

    int[] multiplyNumbers(int[] arr) {
        for (int g = 0; g < arr.length; g++) {
            if (arr[g] < 6) {
                arr[g] *= 2;
            }
        }
        return arr;
    }

    int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    int sumOddNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    int sumEvenNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }


}
