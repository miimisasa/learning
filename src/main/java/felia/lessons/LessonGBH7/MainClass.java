package felia.lessons.LessonGBH7;

//        1. Расширить задачу про котов и тарелки с едой.
//        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//        (например, в миске 10 еды, а кот пытается покушать 15-20).
//        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//        удалось покушать (хватило еды), сытость = true.
//        4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//        наполовину сыт (это сделано для упрощения логики программы).
//        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//        потом вывести информацию о сытости котов в консоль.
//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку

import java.util.Scanner;

public class MainClass {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int weight = 0;
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Байт", 5, false);
        cat[1] = new Cat("Пиксель", 30, false);
        cat[2] = new Cat("Сириус", 10, false);
        cat[3] = new Cat("Фунт", 45, false);
        cat[4] = new Cat("Сири", 45, false);

        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].getFullness() == false && cat[i].getAppetite() < plate.getFood()) {
                cat[i].eat(plate);
                cat[i].fullness = true;
                System.out.println("Коська " + cat[i].getName() + " покушаль!");
            } else {
                System.out.println("Коська " + cat[i].getName() + " не покушаль! А ну быстро корми коську!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в мисочку?");
        weight = sc.nextInt();
        plate.increaseFood(weight);
        plate.info();
    }

}
