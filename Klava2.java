package ru.jabaklava;

// Создать переменные всех пройденных типов данных и инициализировать их значения.

public class Klava {
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] ch (int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void create(int[] array1, int step, int shift){
        for (int a = 0, j = 0; a < array1.length; a++, j += 3)
            array1[a] = j;
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void fixiki(int[] array){
        for(int g = 0; g < array.length; g++){
            if(array[g] < 6){
                array[g] *= 2;
            }
        }
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//не ебу памагитеспасите что это вообще такое
    public static void nolik(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    static int[] simka(int[] array) {
        int[] minmax = new int[2];
        minmax[0] = minmax[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minmax[0] > array[i])
                minmax[0] = array[i];
            if (minmax[1] < array[i])
                minmax[1] = array[i];
        }
        return minmax;
    }

    // Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.

    static boolean dimdimych(int[] array) {
        if (array == null || array.length < 2)
            return false;
        int sumarray = 0, sumLeft = 0;
        for (int i : array)
            sumarray += i;
        if ((sumarray == 0) && (sumarray % 2 != 0))
            return false;
        for (int i = 0; i < array.length - 1; i++) {
            sumLeft += array[i];
            if (sumLeft*2 == sumarray)
                return true;
        }
        return false;
    }

    //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    //а вот здесь точно произошла пизда ничего не знаю ничего не умею
}

