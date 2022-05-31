package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class SerchElementsInArray {
    int[] array = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};

    public static String searchMinAndMax;
    public static int maxNumber;
    public static int minNumber;
    public static boolean findNumber;

    public SerchElementsInArray() {
        this.searchMinAndMax = Arrays.toString(searchMinAndMax(array));
        this.maxNumber = maxNumber(array);
        this.minNumber = minNumber(array);
        this.findNumber = findNumber( 4, array);
    }

    int[] searchMinAndMax(int[] arr) {
        int[] minMax = new int[2];
        minMax[0] = minMax[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minMax[0] > arr[i])
                minMax[0] = arr[i];
            if (minMax[1] < arr[i])
                minMax[1] = arr[i];
        }
        return minMax;
    }

    int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int minNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    boolean findNumber(int searchValue, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }
}
