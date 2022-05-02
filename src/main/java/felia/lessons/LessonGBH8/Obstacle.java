package felia.lessons.LessonGBH8;

public class Obstacle {
    private Wall wall;
    private Road road;

    protected Obstacle(Wall wall, Road road) {
        this.road = road;
        this.wall = wall;
    }

    public int getRoadLength() {
        return road.getLenght();
    }

    public int getWallHeight() {
        return wall.getHeight();
    }

}
