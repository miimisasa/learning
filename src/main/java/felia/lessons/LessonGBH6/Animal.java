package felia.lessons.LessonGBH6;

public abstract class  Animal {
    private int runLimit;
    private float jumpLimit;
    private int swimLimit;
    private static int count;

    public Animal(int runLimit, float jumpLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    protected boolean run(int distance){
        return distance <= runLimit;
    }

    protected boolean jump(float height){
        return height <= jumpLimit;
    }

    protected boolean swim(int distance){
        return distance <= swimLimit;
    }

    public static int getCount() {
        return count;
    }

}
