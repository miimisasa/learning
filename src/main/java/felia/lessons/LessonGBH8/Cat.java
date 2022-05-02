package felia.lessons.LessonGBH8;

public class Cat extends Sportsman{

    public static final String OBJECT_CLASS = "Кот";
    public static final String SUCCESSFUL_RUN_RESULT = " так быстро перебирал лапками, что смог пробежать ";
    public static final String BAD_RUN_RESULT = " не хватило силенок перебирать лапками до конца";
    public static final String SUCCESSFUL_JUMP_RESULT = " использовал хвост как пружинку чтобы преодолеть стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не смог прыгнуть так высоко и теперь зализывает ранки";

    public Cat(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = OBJECT_CLASS + " по кличке " + name;
        super.successfulRunResult = SUCCESSFUL_RUN_RESULT;
        super.badRunResult = BAD_RUN_RESULT;
        super.successfulJumpResult = SUCCESSFUL_JUMP_RESULT;
        super.badJumpResult = BAD_JUMP_RESULT;
    }
}
