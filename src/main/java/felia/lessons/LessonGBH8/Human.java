package felia.lessons.LessonGBH8;

public class Human extends Sportsman{
    public static final String OBJECT_CLASS = "Человек";
    public static final String SUCCESSFUL_RUN_RESULT = " выпил так много молочка, что смог пробежать ";
    public static final String BAD_RUN_RESULT = " просто лох и не пробежал";
    public static final String SUCCESSFUL_JUMP_RESULT = " просто высокий и смог переступить стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не смог прыгнуть так высоко и отправляется тренироваться на кошках.";

    public Human(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = OBJECT_CLASS + " по имени " + name;
        super.successfulRunResult = SUCCESSFUL_RUN_RESULT;
        super.badRunResult = BAD_RUN_RESULT;
        super.successfulJumpResult = SUCCESSFUL_JUMP_RESULT;
        super.badJumpResult = BAD_JUMP_RESULT;
    }
}
