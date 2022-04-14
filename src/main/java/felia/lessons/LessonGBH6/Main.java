package felia.lessons.LessonGBH6;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(200, 2, 0), new Dog(500, 0.5f, 10)};
        for (Animal an : animal) {
            System.out.println(
                    an.getClass().getName() +
                            "\nrun: " + an.run(200) +
                            "\njump: " + an.jump(1.5f) +
                            "\nswim: " + an.swim(5));
        }

        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего собак создано: " + Dog.getCount());
    }
}
