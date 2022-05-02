package felia.lessons.LessonGBH8;

import java.util.ArrayList;

public class ObstacleArray {
    private ArrayList<Obstacle> obstacleArray;

    public ObstacleArray() {
        obstacleArray = new ArrayList<>();
    }

    public void obstacleAdd(Obstacle obstacle) {
        obstacleArray.add(obstacle);
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacleArray;
    }
}
