package felia.lessons.LessonGBH8;

public class Robot extends Sportsman {
    public static final String OBJECT_CLASS = "Робот";
    public static final String SUCCESSFUL_RUN_RESULT = " так быстро перебирал шарнирами, что смог пробежать ";
    public static final String BAD_RUN_RESULT = " не хватило смазки перебирать шарнирами до конца";
    public static final String SUCCESSFUL_JUMP_RESULT = " использовал реактивный ранец чтобы преодолеть стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не хватило топлива прыгнуть так высоко и теперь плачет на заправке";

    public Robot(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = OBJECT_CLASS + " c названием " + name;
        super.successfulRunResult = SUCCESSFUL_RUN_RESULT;
        super.badRunResult = BAD_RUN_RESULT;
        super.successfulJumpResult = SUCCESSFUL_JUMP_RESULT;
        super.badJumpResult = BAD_JUMP_RESULT;
    }
}
