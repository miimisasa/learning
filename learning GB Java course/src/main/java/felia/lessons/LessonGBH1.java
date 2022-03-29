package felia.lessons;

public class LessonGBH1 {

    // Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void main(String[] args) {
        byte a = 36;
        short b = 33;
        int c = 4356;
        long d = 100500L;
        float e = 12.25f;
        double f = -123.123;
        char g = '*';
        boolean k = true;

        String jaba = "Privet,jaba!";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(k);
        System.out.println(jaba);
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float math(float a, float b, float c, float d) {
        float d1 = a * (b + (c / d));
        return d1;
    }
    //Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean numbersCount(int a, int b) {
        if (a + b < 10 || a + b > 20) {
            return false;
        }
        return true;
    }

//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void symbolOfNumber(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean plusOrMinus(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void name (String name) {
        System.out.println("Привет, " + name);
    }

    //*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.

    public static void typeOfYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
    }
}

