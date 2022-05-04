package felia.lessons.LessonGBH8;

public abstract class Sportsman {
    protected String successfulRunResult;
    protected String badRunResult;
    protected String successfulJumpResult;
    protected String badJumpResult;
    protected String successfulSwimResult;
    protected String badSwimResult;
    protected String canNotRun;
    protected String canNotJump;
    protected String canNotSwim;
    protected String info;
    protected int maxLenght;
    protected int maxDistance;
    protected int maxHeight;
    private boolean statusOfSportsman;

    public Sportsman(String name, int maxDistance, int maxHeight, int maxLenght) {
        this.successfulRunResult = "";
        this.badRunResult = "";
        this.successfulJumpResult = "";
        this.badJumpResult = "";
        this.info = "";
        this.maxLenght = maxLenght;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.statusOfSportsman = true;
    }

    public String getInfo() {
        return info;
    }

    public boolean getStatusOfSportsman() {
        return statusOfSportsman;
    }

    public String getRunResult(int distance) {
        if (run(distance, maxDistance) && statusOfSportsman) {
            return info + successfulRunResult + distance + "m";
        } else if (distance == 0) {
            return info + canNotRun;
        } else {
            statusOfSportsman = false;
            return info + badRunResult;
        }
    }

    public String getJumpResult(int height) {
        if (jump(height, maxHeight) && statusOfSportsman) {
            return info + successfulJumpResult + height + "m";
        } else if (height == 0) {
            return info + canNotJump;
        } else {
            statusOfSportsman = false;
            return info + badJumpResult;
        }
    }

    public String getSwimResult(int lenghtSwim) {
        if (swim(lenghtSwim, maxLenght) && statusOfSportsman) {
            return info + successfulSwimResult + lenghtSwim + "m";
        } else if (lenghtSwim == 0) {
            return info + canNotSwim;
        } else {
            statusOfSportsman = false;
            return info + badSwimResult;
        }
    }

    public boolean swim(int lenghtSwim, int maxLenght) {
        if (lenghtSwim <= maxLenght) {
            return true;
        } else {
            return false;
        }
    }

    public boolean run(int distance, int maxDistance) {
        if (distance <= maxDistance) {
            return true;
        } else {
            return false;
        }
    }

    public boolean jump(int height, int maxHeight) {
        if (height <= maxHeight) {
            return true;
        } else {
            return false;
        }
    }


}
