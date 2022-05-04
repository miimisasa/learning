package felia.lessons.LessonGBH8;

public class Program {

    public static void main(String[] args) {
        Team teamOne = new Team("Малышарики");
        teamOne.addSportsman(new Human("Петрович", 600, 1, 0));
        teamOne.addSportsman(new Cat("Мурка", 300, 0, 2));
        teamOne.addSportsman(new Robot("Андроид", 0, 4, 9));
        teamOne.addSportsman(new Crocodile("Гена", 1000, 3, 10));


        Team teamTwo = new Team("Киборги");
        teamTwo.addSportsman(new Human("Мирослав", 1000, 0, 12));
        teamTwo.addSportsman(new Cat("Пиксель", 0, 3,1));
        teamTwo.addSportsman(new Robot("Робот Болат", 6000, 6,0));
        teamTwo.addSportsman(new Crocodile("Чебурашка", 100, 1, 15));


        ObstacleArray roadOfObstacle = new ObstacleArray();
        roadOfObstacle.obstacleAdd(new Obstacle(new Wall(1), new Road(600), new Pull(10)));
        roadOfObstacle.obstacleAdd(new Obstacle(new Wall(0), new Road(200), new Pull(3)));
        roadOfObstacle.obstacleAdd(new Obstacle(new Wall(2), new Road(1000), new Pull(1)));

        teamOne.getTeamInfo();
        teamOne.startCompetition(roadOfObstacle.getObstacles());

        teamTwo.getTeamInfo();
        teamTwo.startCompetition(roadOfObstacle.getObstacles());

        teamOne.getWinner();
        teamTwo.getWinner();
    }
}
