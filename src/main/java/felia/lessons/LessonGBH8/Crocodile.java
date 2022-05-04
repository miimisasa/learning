package felia.lessons.LessonGBH8;


public class Crocodile extends Sportsman {

    public static final String OBJECT_CLASS = "Крокодил";
    public static final String SUCCESSFUL_RUN_RESULT = " вынырнул, поднял хвостик и пробежал ";
    public static final String BAD_RUN_RESULT = " не хватило объема легких чтобы задержать дыхание и пробежать до конца";
    public static final String SUCCESSFUL_JUMP_RESULT = " переполз четырьмя лапами стенку высотой ";
    public static final String BAD_JUMP_RESULT = " за стенкой не было мяса, решил не тратить силы ";
    public static final String SUCCESSFUL_SWIM_RESULT = " увидел рыбку и решил ее сожрать, так что проплыл ";
    public static final String BAD_SWIM_RESULT = " набрал лишний вес, запыхался пока плыл и устал ";
    public static final String CAN_NOT_RUN = " тип не из наших, не умеет бегать ";
    public static final String CAN_NOT_JUMP = " он вам попрыгунчик что ли? куда ему прыгать, он огромный";
    public static final String CAN_NOT_SWIM = " решил себя засушить, чтобы быть вечно молодым";

    public Crocodile(String name, int maxDistance, int maxHeight, int maxLenght) {
        super(name, maxDistance, maxHeight, maxLenght);
        super.info = OBJECT_CLASS + " по кличке " + name;
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
