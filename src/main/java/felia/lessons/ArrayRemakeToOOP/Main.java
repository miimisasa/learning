package felia.lessons.ArrayRemakeToOOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MathActionsWithArray mathArray = new MathActionsWithArray();
        LogicActionsWithArrays logicArray = new LogicActionsWithArrays();
        SerchElementsInArray searchArray = new SerchElementsInArray();
        SortOfArrays aortArray = new SortOfArrays();

        System.out.println("Замена 1 на 0 в массиве : " + LogicActionsWithArrays.changeNullToOne + "\n");
        System.out.println("Заполнение диагоналей в массиве единицами : " + LogicActionsWithArrays.fullOneDiagonal + "\n");
        System.out.println("Если сумма правой и левой части массива равны, возвращается истина : " + LogicActionsWithArrays.sumLeftAndRight + "\n");
        System.out.println("Сдвиг массива на определенное значение : " + LogicActionsWithArrays.moveArray + "\n");
        System.out.println("Количество повторений в массиве : " + LogicActionsWithArrays.getCountRepeatNumbers + "\n");

        System.out.println("Заполнить массив числами кратными 3 : " + MathActionsWithArray.fullArray + "\n");
        System.out.println("Массив, где числа меньше 6 умножены на 2 : " + MathActionsWithArray.multiplyNumbers + "\n");
        System.out.println("Сумма чисел массива : " + MathActionsWithArray.sumArray + "\n");
        System.out.println("Сумма нечетных чисел массива : " + MathActionsWithArray.sumOddNumbers + "\n");
        System.out.println("Сумма четных чисел массива : " + MathActionsWithArray.sumEvenNumbers + "\n");

        System.out.println("Минимальное и максимальное значение в массиве : " + SerchElementsInArray.searchMinAndMax + "\n");
        System.out.println("Максимальное число массива : " + SerchElementsInArray.maxNumber + "\n");
        System.out.println("Минимальное число массива : " + SerchElementsInArray.minNumber + "\n");
        System.out.println("Найти заданное число в массиве : " + SerchElementsInArray.findNumber + "\n");

        System.out.println("Массив отсортированный от минимального к максимальному : " + SortOfArrays.sortMinToMax + "\n");
        System.out.println("Массив отсортированный от максимального к минимальному : " + SortOfArrays.sortMaxToMin + "\n");
        System.out.println("Массив с нечетными числами : " + SortOfArrays.oddNumbers + "\n");
        System.out.println("Массив с четными числами : " + SortOfArrays.evenNumbers + "\n");
        System.out.println("Массив в котором идут по порядку сначала четные, а затем нечетные числа : " + SortOfArrays.sortArrayFromEvenToNotEven + "\n");
    }
}
