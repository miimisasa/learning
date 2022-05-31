package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class SortOfArrays {
    int[] array = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};

    public static String sort;
    public static String sortMinToMax;
    public static String sortMaxToMin;
    public static String oddNumbers;
    public static String evenNumbers;
    public static String sortArrayFromEvenToNotEven;

    public SortOfArrays() {
        this.sort = Arrays.toString(sort(array));
        this.sortMinToMax = Arrays.toString(array);
        this.sortMaxToMin = Arrays.toString(array);
        this.oddNumbers = Arrays.toString(oddNumbers(array));
        this.evenNumbers = Arrays.toString(evenNumbers(array));
        this.sortArrayFromEvenToNotEven = Arrays.toString(sortArrayFromEvenToNotEven(array));
    }

    int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    int[] sortMinToMax(int[] array) {
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

    int[] sortMaxToMin(int[] array) {
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

    int[] oddNumbers(int[] array) {
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

    int[] evenNumbers(int[] array) {
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

    int[] sortArrayFromEvenToNotEven(int[] array){
        return getGeneralArray(array);
    }

    int getSizeNotEvenArray(int[] array) {
        int sizeNotEvenArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sizeNotEvenArr++;
            }
        }
        return sizeNotEvenArr;
    }

    int getCountNotEven(int[] array, int[] newNotEvenArray) {
        int countNotEven = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                newNotEvenArray[countNotEven] = array[j];
                countNotEven++;
            }
        }
        return countNotEven;
    }

    int[] getNewNotEvenOrEvenArray(int[] array) {
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

    int[] getNotEvenArray(int[] array) {
        int sizeNotEvenArr = getSizeNotEvenArray(array);
        int[] newNotEvenArray = new int[sizeNotEvenArr];
        int countNotEven = getCountNotEven(array, newNotEvenArray);
        getNewNotEvenOrEvenArray(newNotEvenArray);
        return newNotEvenArray;
    }

    int[] getEvenArray(int[] array) {
        int sizeEvenArray = getSizeEvenArray(array);
        int[] newEvenArray = new int[sizeEvenArray];
        int countEven = getEvenCount(array, newEvenArray);
        getNewNotEvenOrEvenArray(newEvenArray);
        return newEvenArray;

    }

    int getSizeEvenArray(int[] array) {
        int sizeArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sizeArr++;
            }
        }
        return sizeArr;
    }

    int getEvenCount(int[] array, int[] newEvenArray) {
        int count = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                newEvenArray[count] = array[j];
                count++;
            }
        }
        return count;
    }

    int[] getGeneralArray(int[] array) {
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
