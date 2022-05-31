package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class LogicActionsWithArrays {
    int[] array = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};
    public static String changeNullToOne;
    public static String fullOneDiagonal;
    public static boolean sumLeftAndRight;
    public static String moveArray;
    public static String getCountRepeatNumbers;

    public LogicActionsWithArrays() {
        this.changeNullToOne = Arrays.toString(changeNullToOne(array));
        this.fullOneDiagonal = Arrays.deepToString(fullOneDiagonal(4));
        this.sumLeftAndRight = sumLeftAndRight(array);
        this.moveArray = Arrays.toString(moveArray(array,3));
        this.getCountRepeatNumbers = getCountRepeatNumbers(array);
    }

    int[] changeNullToOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }


    int[][] fullOneDiagonal(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        return arr;
    }

    boolean sumLeftAndRight(int[] arr) {
        int left = 0;
        int right = 0;

        for (int i : arr) {
            right += i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (left == right) {
                return true;
            }
            left += arr[i];
            right -= arr[i];
        }
        return false;
    }

    int[] moveArray(int[] array, int value) {
        if (value > 0) {
            for (int i = 0; i < value; i++) {
                moveRight(array);
            }
        } else {
            value = value * (-1);
            for (int i = 0; i < value; i++) {
                moveLeft(array);
            }
        }

        return array;
    }

    void moveRight(int[] array) {
        int size = array.length;
        int temp = array[size - 1];

        for (int j = size - 1; j > 0; j--) {
            array[j] = array[j - 1];
        }
        array[0] = temp;
    }

    void moveLeft(int[] array) {
        int size = array.length;
        int temp = array[0];

        for (int j = 0; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        array[size - 1] = temp;
    }

    String getCountRepeatNumbers(int[] array) {
        int[] arrUniqueNumbers = new int[getSizeForNewArrayUnicNumber(array)];

        String result = "";
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!checkExistsNumber(arrUniqueNumbers, array[i])) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j])
                        count++;
                }
                arrUniqueNumbers[currentIndex] = array[i];
                currentIndex++;

                result = result + "число: " + array[i] + " встречается " + count + " раз(а).\n";
            }
        }
        return result;
    }

    boolean checkExistsNumber(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }

    int getSizeForNewArrayUnicNumber(int[] array) {
        int[] newSize = new int[array.length];
        int res = 0;
        int countNum = 0;
        int count = 0;
        for (int i = 0; i < newSize.length; i++) {
            newSize[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (newSize[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        newSize[j] = 1;
                        count++;
                    }
                }
            }
            if (countNum < count) {
                countNum = count;
                res++;
            }
        }
        return res;
    }

}
