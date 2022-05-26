package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class SortOfArrays {

    static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] sortMinToMax(int[] array) {
        boolean pin = false;
        while (pin == false) {
            pin = true;

            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1) {
                    if (array[i] > array[i + 1]) {
                        pin = false;
                        int buffer = 0;
                        buffer = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buffer;
                    }
                }
            }
        }
        return array;
    }

    public static int[] sortMaxToMin(int[] array) {
        boolean pin = false;
        while (pin == false) {
            pin = true;
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1) {
                    if (array[i] < array[i + 1]) {
                        pin = false;
                        int buffer = 0;
                        buffer = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buffer;
                    }
                }
            }
        }
        return array;
    }

    static int[] OddNumbers(int[] array) {
        int sizeArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sizeArr++;
            }
        }
        int[] newArray = new int[sizeArr];
        int count = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                newArray[count] = array[j];
                count++;
            }
        }
        return newArray;
    }

    static int[] EvenNumbers(int[] array) {
        int sizeArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sizeArr++;
            }
        }
        int[] newArray = new int[sizeArr];
        int count = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                newArray[count] = array[j];
                count++;
            }
        }
        return newArray;
    }

    static int[] sortArrayFromEvenToNotEven(int[] array){
        return getGeneralArray(array);
    }

    static int getSizeNotEvenArray(int[] array) {
        int sizeNotEvenArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sizeNotEvenArr++;
            }
        }
        return sizeNotEvenArr;
    }

    static int getCountNotEven(int[] array, int[] newNotEvenArray) {
        int countNotEven = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                newNotEvenArray[countNotEven] = array[j];
                countNotEven++;
            }
        }
        return countNotEven;
    }

    static int[] getNewNotEvenOrEvenArray(int[] array) {
        boolean pin = false;
        while (pin == false) {
            pin = true;

            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1) {
                    if (array[i] > array[i + 1]) {
                        pin = false;
                        int buffer = 0;
                        buffer = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buffer;
                    }
                }
            }
        }
        return array;
    }

    static int[] getNotEvenArray(int[] array) {
        int sizeNotEvenArr = getSizeNotEvenArray(array);
        int[] newNotEvenArray = new int[sizeNotEvenArr];
        int countNotEven = getCountNotEven(array, newNotEvenArray);
        getNewNotEvenOrEvenArray(newNotEvenArray);
        return newNotEvenArray;
    }

    static int[] getEvenArray(int[] array) {
        int sizeEvenArray = getSizeEvenArray(array);
        int[] newEvenArray = new int[sizeEvenArray];
        int countEven = getEvenCount(array, newEvenArray);
        getNewNotEvenOrEvenArray(newEvenArray);
        return newEvenArray;

    }

    static int getSizeEvenArray(int[] array) {
        int sizeArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sizeArr++;
            }
        }
        return sizeArr;
    }

    static int getEvenCount(int[] array, int[] newEvenArray) {
        int count = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                newEvenArray[count] = array[j];
                count++;
            }
        }
        return count;
    }

    static int[] getGeneralArray(int[] array) {
        int[] generalArray = new int[getEvenArray(array).length + getNotEvenArray(array).length];
        int countGeneral = 0;
        for (int i = 0; i < getEvenArray(array).length; i++) {
            generalArray[i] = getEvenArray(array)[i];
            countGeneral++;
        }
        for (int j = 0; j < getNotEvenArray(array).length; j++) {
            generalArray[countGeneral++] = getNotEvenArray(array)[j];
        }
        return generalArray;
    }
}
