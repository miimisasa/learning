package felia.lessons.LessonGBH8;

public class Obstacle {
    private Wall wall;
    private Road road;
    private Pull pull;

    protected Obstacle(Wall wall, Road road, Pull pull) {
        this.road = road;
        this.wall = wall;
        this.pull = pull;
    }

    public int getRoadLength() {
        return road.getLenght();
    }

    public int getWallHeight() {
        return wall.getHeight();
    }

    public int getPullLenght(){
        return pull.getLenghtSwim();
    }



}
