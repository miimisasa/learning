package felia.lessons.LessonGBH8;

public class Human extends Sportsman{
    public static final String OBJECT_CLASS = "Человек";
    public static final String SUCCESSFUL_RUN_RESULT = " выпил так много молочка, что смог пробежать ";
    public static final String BAD_RUN_RESULT = " просто лох и не пробежал";
    public static final String SUCCESSFUL_JUMP_RESULT = " просто высокий и смог переступить стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не смог прыгнуть так высоко и отправляется тренироваться на кошках.";
    public static final String SUCCESSFUL_SWIM_RESULT = " увидел рыбку и решил ее сожрать, так что проплыл ";
    public static final String BAD_SWIM_RESULT = " набрал лишний вес, запыхлся пока плыл и устал ";
    public static final String CAN_NOT_RUN = " тип не из наших, не умеет бегать ";
    public static final String CAN_NOT_JUMP = " он вам попрыгунчик что ли? куда ему прыгать, он огромный";
    public static final String CAN_NOT_SWIM = " решил себя засушить, чтобы быть вечно молодым";

    public Human(String name, int maxDistance, int maxHeight, int maxLenght) {
        super(name, maxDistance, maxHeight, maxLenght);
        super.info = OBJECT_CLASS + " по имени " + name;
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
