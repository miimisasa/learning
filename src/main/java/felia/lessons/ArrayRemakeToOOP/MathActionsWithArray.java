package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class MathActionsWithArray {

    public static int[] fullArray() {
        int[] array1 = new int[8];
        for (int a = 0, j = 0; a < array1.length; a++, j += 3)
            array1[a] = j;
        System.out.println("Последовательность в цикле с шагом 3: " + Arrays.toString(array1));
        return array1;
    }

    public static int[] multiplyNumbers(int[] arr) {
        for (int g = 0; g < arr.length; g++) {
            if (arr[g] < 6) {
                arr[g] *= 2;
            }
        }
        System.out.println("Массив, где числа < 6 умножены на 2 : " + Arrays.toString(arr));
        return arr;
    }

    static int sumAray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    static int sumOddNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    static int sumEvenNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }


}
