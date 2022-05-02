package felia.lessons.LessonGBH8;

public class Program {

    public static void main(String[] args) {
        Team teamOne = new Team("Малышарики");
        teamOne.addSportsman(new Human("Петрович", 600, 1));
        teamOne.addSportsman(new Cat("Мурка", 300, 2));
        teamOne.addSportsman(new Robot("Андроид", 4000, 4));

        Team teamTwo = new Team("Киборги");
        teamTwo.addSportsman(new Human("Мирослав", 1000, 1));
        teamTwo.addSportsman(new Cat("Пиксель", 400, 3));
        teamTwo.addSportsman(new Robot("Робот Болат", 6000, 6));

        ObstacleArray roadOfObstacle = new ObstacleArray();
        roadOfObstacle.obstacleAdd(new Obstacle(new Wall(1), new Road(600)));
        roadOfObstacle.obstacleAdd(new Obstacle(new Wall(0), new Road(200)));
        roadOfObstacle.obstacleAdd(new Obstacle(new Wall(2), new Road(1000)));

        teamOne.getTeamInfo();
        teamOne.startCompetition(roadOfObstacle.getObstacles());

        teamTwo.getTeamInfo();
        teamTwo.startCompetition(roadOfObstacle.getObstacles());

        teamOne.getWinner();
        teamTwo.getWinner();
    }
}
