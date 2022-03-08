package ru.jabaklava;

// Создать переменные всех пройденных типов данных и инициализировать их значения.

public class Klava {
    public static void main(String[] args) {
        byte a1 = 36;
        short b1 = 33;
        int c1 = 4356;
        long d1 = 100500L;
        float e = 12.25f;
        double f = -123.123;
        char g = '*';
        boolean k = true;

        String jaba = "Privet,jaba!";
                System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(k);
        System.out.println(jaba);
    }
     //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float luntik(float a,float b,float c,float d) {
float d1 = a * (b + (c / d));
return d1;
    }
    //Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean pchelenok (int mila, int pupsen){
        if (mila + pupsen <10 || mila + pupsen >20 ){return false;}
        return true;}

//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void vupsen (int a2){
        if(a2<0){
            System.out.println("Число отрицательное.");
        }
        else {
            System.out.println("Число положительное.");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean kuzya (int a3){
        if (a3<0){
            return true;
        }
        else {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void Shershulya(String babakapa){
        System.out.println("Привет, "+ babakapa);
    }

    //*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.

    public static void piyavka (int year){
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("Год высокосный");
        }
        else {
            System.out.println("Год не высокосный");
        }
    }
}