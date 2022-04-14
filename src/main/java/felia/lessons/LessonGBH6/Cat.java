package felia.lessons.LessonGBH6;

public class Cat extends Animal{
    private static int count;

    Cat(int runLimit, float jumpLimit, int swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
        count++;
    }

    @Override
    protected boolean swim(int distance){
        return false;
    }

    public static int getCount(){
        return count;
    }
}
