package felia.lessons;

import java.util.Arrays;

public class LessonD {
    public static void main(String[] args) {
        int[] array = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};
        value(array);
        maxNumber(array);
        minNumber(array);
        sort(array);
        sortMinToMax(array);
        sortMaxToMin(array);
        System.out.println("Сумма нечетных чисел: " + sumNotTwoNumbers(array));
        System.out.println("Сумма четных чисел: " + sumTwoNumbers(array));
        int NUMBER = 23;
        System.out.println("поиск числа " + NUMBER + ", результат: " + findNumber(NUMBER, array));
        System.out.println("Массив нечетных чисел: " + Arrays.toString(notTwoNumbers(array)));
        System.out.println("Массив четных чисел: " + Arrays.toString(twoNumbers(array)));
        System.out.println("Отсортированный массив по возрастанию четных и нечетных чисел: " + sortArray(array));
        System.out.println(getCountRepeatNumbers(array));
        //checkExistsUnicNumber(array);
    }

    //0. Вернуть сумму чисел массива
    static void value(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма массива: " + sum);
    }

    //1. Найти максимальное число массива
    static void maxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }

    //2. Найти минимальное число массива
    static void minNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);
    }

    static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println("Сортировка массива с функцией sort(): " + Arrays.toString(array));
    }

    //4. Отсортировать min -> max и вернуть массив
    public static boolean sortMinToMax(int[] array) {
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
        System.out.println("Сортировка массива от меньшего к большему: " + Arrays.toString(array));
        return pin;
    }

    //3. Отсортировать max -> min и вернуть массив
    static void sortMaxToMin(int[] array) {
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
        System.out.println("Сортировка массива от большего к меньшему: " + Arrays.toString(array));
    }

    //8. Вернуть сумму только нечетных чисел
    static int sumNotTwoNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    //9. Вернуть сумму только четных чисел
    static int sumTwoNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    //10. Найти число в массиве и вернуть true в случае если найдено, иначе false
    static boolean findNumber(int searchValue, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }

    //6. Вернуть массив только нечетных чисел
    static int[] notTwoNumbers(int[] array) {
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

    //5. Вернуть массив только четных чисел
    static int[] twoNumbers(int[] array) {
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

    //9. Вернуть массив(сперва идут четные числа, а затем нечетные по возрастанию)
    public static String sortArray(int[] array) {
        int sizeNotEvenArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sizeNotEvenArr++;
            }
        }
        int[] newNotArray = new int[sizeNotEvenArr];
        int countNot = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                newNotArray[countNot] = array[j];
                countNot++;
            }
        }
        boolean pinNot = false;
        while (pinNot == false) {
            pinNot = true;

            for (int i = 0; i < newNotArray.length; i++) {
                if (i < newNotArray.length - 1) {
                    if (newNotArray[i] > newNotArray[i + 1]) {
                        pinNot = false;
                        int bufferNot = 0;
                        bufferNot = newNotArray[i];
                        newNotArray[i] = newNotArray[i + 1];
                        newNotArray[i + 1] = bufferNot;
                    }
                }
            }
        }
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

        boolean pin = false;
        while (pin == false) {
            pin = true;

            for (int i = 0; i < newArray.length; i++) {
                if (i < newArray.length - 1) {
                    if (newArray[i] > newArray[i + 1]) {
                        pin = false;
                        int buffer = 0;
                        buffer = newArray[i];
                        newArray[i] = newArray[i + 1];
                        newArray[i + 1] = buffer;
                    }
                }
            }
        }

        int[] generalArray = new int[newArray.length + newNotArray.length];
        int countGeneral = 0;
        for (int i = 0; i < newArray.length; i++) {
            generalArray[i] = newArray[i];
            countGeneral++;
        }
        for (int j = 0; j < newNotArray.length; j++) {
            generalArray[countGeneral++] = newNotArray[j];
        }
        return Arrays.toString(generalArray);
    }

    public static String getCountRepeatNumbers(int[] array) {
        int[] arrUniqueNumbers = new int[getSizeForNewArrayUnicNumber(array)];

        String result = "";
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!checkExistsNumber(arrUniqueNumbers, array[i])) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) count++;
                }
                arrUniqueNumbers[currentIndex] = array[i];
                currentIndex++;

                result = result + "число: " + array[i] + " встречается " + count + " раз(а).\n";
            }
        }
        return result;
    }

    //11. Вернуть количество повторяющихся значений в массиве (в виде число 5 - 3 раза)
    public static boolean checkExistsNumber(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }

    public static int getSizeForNewArrayUnicNumber(int[] array) {
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
    } //метод для подсчета уникальных чисел в массиве

//    public static void checkExistsUnicNumber(int[] array) {
//        int[] bufferUnicArr = new int[getSizeForNewArrayUnicNumber(array)];//используем метод чтобы указать размер для массива только! с уникальными числами
//        int number = 0;
//        for (int i = 0; i < array.length; i++) {
//            number = array[i];
//            for (int j = 0; j < array.length + 1; j++) {
//                if (number != bufferUnicArr[j]) {
//                    bufferUnicArr[i] = number;
//                }
//                System.out.println(Arrays.toString(bufferUnicArr));
//            }
//        }
//    }

}





