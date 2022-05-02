package felia.lessons.LessonGBH8;

public abstract class Sportsman {
    protected String successfulRunResult;
    protected String badRunResult;
    protected String successfulJumpResult;
    protected String badJumpResult;
    protected String info;
    protected int maxDistance;
    protected int maxHeight;
    private boolean statusOfSportsman;

    public Sportsman(String name, int maxDistance, int maxHeight) {
        this.successfulRunResult = "";
        this.badRunResult = "";
        this.successfulJumpResult = "";
        this.badJumpResult = "";
        this.info = "";
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
        if (run(distance, maxDistance) && statusOfSportsman ) {
            return info + successfulRunResult + distance +"m";
        }
        statusOfSportsman = false;
        return info + badRunResult;
    }

    public String getJumpResult(int height) {
        if (jump(height, maxHeight) && statusOfSportsman ) {
            return info + successfulJumpResult + height +"m";
        }
        statusOfSportsman = false;
        return info + badJumpResult;
    }

    public boolean run(int distance, int maxDistance) {
        if (distance < maxDistance) {
            return true;
        } else {
            return false;
        }
    }

    public boolean jump(int height, int maxHeight) {
        if (height < maxHeight) {
            return true;
        } else {
            return false;
        }
    }
}
