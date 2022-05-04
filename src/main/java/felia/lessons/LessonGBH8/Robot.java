package felia.lessons.LessonGBH8;

public class Robot extends Sportsman {
    public static final String OBJECT_CLASS = "Робот";
    public static final String SUCCESSFUL_RUN_RESULT = " так быстро перебирал шарнирами, что смог пробежать ";
    public static final String BAD_RUN_RESULT = " не хватило смазки перебирать шарнирами до конца";
    public static final String SUCCESSFUL_JUMP_RESULT = " использовал реактивный ранец чтобы преодолеть стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не хватило топлива прыгнуть так высоко и теперь плачет на заправке";
    public static final String SUCCESSFUL_SWIM_RESULT = " создатель гений и добавил водонепроницаемость роботу и тот проплыл ";
    public static final String BAD_SWIM_RESULT = " набрал лишний металл, запыхлся пока плыл и устал ";
    public static final String CAN_NOT_RUN = " заржавели шарниры отказался бежать ";
    public static final String CAN_NOT_JUMP = " он вам попрыгунчик что ли? куда ему прыгать, он огромный";
    public static final String CAN_NOT_SWIM = " создатель дебил, не добавил водонепроницаемость, робот утонул ";

    public Robot(String name, int maxDistance, int maxHeight, int maxLenght) {
        super(name, maxDistance, maxHeight, maxLenght);
        super.info = OBJECT_CLASS + " c названием " + name;
        super.successfulRunResult = SUCCESSFUL_RUN_RESULT;
        super.badRunResult = BAD_RUN_RESULT;
        super.successfulJumpResult = SUCCESSFUL_JUMP_RESULT;
        super.badJumpResult = BAD_JUMP_RESULT;
        super.successfulSwimResult = SUCCESSFUL_SWIM_RESULT;
        super.badSwimResult = BAD_SWIM_RESULT;
        super.canNotRun = CAN_NOT_RUN;
        super.canNotJump = CAN_NOT_JUMP;
        super.canNotSwim = CAN_NOT_SWIM;
    }
}
