package felia.lessons.LessonGBH6;

public class Dog extends Animal{
    private static int count;

    Dog(int runLimit, float jumpLimit, int swimLimit) {
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
