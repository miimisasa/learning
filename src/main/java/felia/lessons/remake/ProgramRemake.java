package felia.lessons.remake;

import felia.lessons.remake.members.Cat;
import felia.lessons.remake.members.Dog;
import felia.lessons.remake.members.Robot;
import felia.lessons.remake.members.common.Member;
import felia.lessons.remake.obstacle.Fire;
import felia.lessons.remake.obstacle.Pull;
import felia.lessons.remake.obstacle.Road;
import felia.lessons.remake.obstacle.common.Obstacle;

import java.util.ArrayList;

public class ProgramRemake {
    public static void main(String[] args) {
        Member cat = new Cat("Alice", 12, 8);
        Member dog = new Dog("Haskell", 14, 24);
        Member robot = new Robot("Android", 55);

        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
        obstacles.add(new Fire(15));
        obstacles.add(new Pull(13));
        obstacles.add(new Road(10));

        System.out.println("=== Собакен начал проходить испытания! ===");
        for(Obstacle obs : obstacles) {
            obs.action(dog);
        }
        System.out.println("=== Собакен закончил проходить испытания! ===");

    }
}
