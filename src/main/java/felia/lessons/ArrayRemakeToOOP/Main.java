package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 55, 8, 93, 44, 66};

        System.out.println("Замена 1 на 0 в массиве : "+ Arrays.toString(LogicActionsWithArrays.changeNullToOne(new int[5]))+ "\n");
        System.out.println("Заполнение диагоналей в массиве единицами : " + Arrays.deepToString(LogicActionsWithArrays.fullOneDiagonal(4)) + "\n");
        System.out.println("Если сумма правой и левой части массива равны, возвращается истина : " + LogicActionsWithArrays.sumLeftAndRight(array)+ "\n");
        System.out.println("Сдвиг массива на определенное значение : " + Arrays.toString(LogicActionsWithArrays.moveArray(array,5))+ "\n");
        System.out.println("Количество повторений в массиве : " + LogicActionsWithArrays.getCountRepeatNumbers(array)+ "\n");

        System.out.println("Заполнить массив числами кратными 3 : " + Arrays.toString(MathActionsWithArray.fullArray())+ "\n");
        System.out.println("Массив, где числа меньше 6 умножены на 2 : " + Arrays.toString(MathActionsWithArray.multiplyNumbers(array))+ "\n");
        System.out.println("Сумма чисел массива : " + MathActionsWithArray.sumAray(array)+ "\n");
        System.out.println("Сумма нечетных чисел массива : " + MathActionsWithArray.sumOddNumbers(array)+ "\n");
        System.out.println("Сумма четных чисел массива : " + MathActionsWithArray.sumEvenNumbers(array)+ "\n");

        System.out.println("Минимальное и максимальное значение в массиве : " + Arrays.toString(SerchElementsInArray.searchMinAndMax(array))+ "\n");
        System.out.println("Максимальное число массива : " + SerchElementsInArray.maxNumber(array)+ "\n");
        System.out.println("Минимальное число массива : " + SerchElementsInArray.minNumber(array) + "\n");
        System.out.println("Найти заданное число в массиве : "+ SerchElementsInArray.findNumber(5, array) + "\n");

        System.out.println("Массив отсортированный от минимального к максимальному : " + Arrays.toString(SortOfArrays.sortMinToMax(array))+ "\n");
        System.out.println("Массив отсортированный от максимального к минимальному : " + Arrays.toString(SortOfArrays.sortMaxToMin(array))+ "\n");
        System.out.println("Массив с нечетными числами : " + Arrays.toString(SortOfArrays.OddNumbers(array))+ "\n");
        System.out.println("Массив с четными числами : " + Arrays.toString(SortOfArrays.EvenNumbers(array))+ "\n");
        System.out.println("Массив в котором идут по порядку сначала четные, а затем нечетные числа : " + Arrays.toString(SortOfArrays.sortArrayFromEvenToNotEven(array))+ "\n");
    }
}
