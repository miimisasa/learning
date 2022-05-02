package felia.lessons.LessonGBH8;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String[] array;
    private ArrayList<Sportsman> team;
    private String teamName;

    public Team(String teamName) {
        this.team = new ArrayList<Sportsman>();
        this.teamName = teamName;
    }

    public void addSportsman(Sportsman sportsman) {
        team.add(sportsman);
    }

    public void getTeamInfo() {
        array = new String[team.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = team.get(i).getInfo();
        }
        System.out.print("Команда " + teamName + " состоит из : " + Arrays.toString(array));
    }

    public void startCompetition(ArrayList<Obstacle> course) {
        System.out.println("Соревнования начинаются!");
        for (Obstacle obstacle : course) {
            for (int i = 0; i < array.length; i++) {
                if (team.get(i).getStatusOfSportsman()) {
                    System.out.println(team.get(i).getRunResult(obstacle.getRoadLength()));
                }
                if (team.get(i).getStatusOfSportsman()) {
                    System.out.println(team.get(i).getJumpResult(obstacle.getWallHeight()));
                }
            }
        }
    }

    public void getWinner() {
        for (Sportsman sportsman : team) {
            if (sportsman.getStatusOfSportsman()) {
                System.out.println("\nПобедитель в команде" + teamName + "" + sportsman.info);
            }
        }
    }
}
