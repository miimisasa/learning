package felia.lessons.ArrayRemakeToOOP;

public class SerchElementsInArray {

    static int[] searchMinAndMax(int[] arr) {
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

    static int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int minNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static boolean findNumber(int searchValue, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }
}
