package felia.lessons;

import java.util.Arrays;

public class LessonGBH2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Замена в массиве 0 на 1 и наоборот: " + Arrays.toString(changeNullToOne(array)));
        int[] array1 = new int[8];
        fullArray();
        int[] arr = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};
        multiplyNumbers(arr);
        int size = 6;
        fullOneDiagonal(size);
        System.out.println("Минимальное и максимальное значения массива: " + Arrays.toString(searchMinAndMax(arr)));
        System.out.println("Cумма левой и правой части массива равны: " + sumLeftAndRight());
        System.out.println("Cумма левой и правой части массива равны(другой способ): " + sumLeftAndRight2(arr));
        System.out.println(Arrays.toString(moveArray(array, -3)));
    }

    //Задание №1

    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] changeNullToOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    //Задание №2

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fullArray() {
        int[] array1 = new int[8];
        for (int a = 0, j = 0; a < array1.length; a++, j += 3)
            array1[a] = j;
        System.out.println("Последовательность в цикле с шагом 3: " + Arrays.toString(array1));
    }

    //Задание №3

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньше 6 умножить на 2;
    public static void multiplyNumbers(int[] arr) {
        for (int g = 0; g < arr.length; g++) {
            if (arr[g] < 6) {
                arr[g] *= 2;
            }
        }
        System.out.println("Массив, где числа < 6 умножены на 2 : " + Arrays.toString(arr));
    }

    //Задание №4

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fullOneDiagonal(int size) {
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.print (sqrArray[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    //Задание №5

    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    static int[] searchMinAndMax(int[] arr) {
        int[] minmax = new int[2];
        minmax[0] = minmax[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minmax[0] > arr[i])
                minmax[0] = arr[i];
            if (minmax[1] < arr[i])
                minmax[1] = arr[i];
        }
        return minmax;
    }

    //Задание №6

    // Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.

    static boolean sumLeftAndRight () {
        int [] arr = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};
        if (arr == null || arr.length < 2)
            return false;
        int sumarray = 0, sumLeft = 0;
        for (int i : arr)
            sumarray += i;
        if ((sumarray == 0) && (sumarray % 2 != 0))
            return false;
        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft += arr[i];
            if (sumLeft * 2 == sumarray)
                return true;
        }
        return false;
    }

    //Задание №6(другой способ)
    public static boolean sumLeftAndRight2 (int[] arr) {
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

    //Задание №7
    //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    public static int[] moveArray(int[] array, int value) {
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

    public static void moveRight(int[] array) {
        int size = array.length;
        int temp = array[size - 1];

        for (int j = size - 1; j > 0; j--) {
            array[j] = array[j - 1];
        }
        array[0] = temp;
    }

    public static void moveLeft(int[] array) {
        int size = array.length;
        int temp = array[0];

        for (int j = 0; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        array[size - 1] = temp;
    }

}
