package felia.lessons.remake.obstacle;

import felia.lessons.remake.members.actions.Running;
import felia.lessons.remake.members.actions.Swimming;
import felia.lessons.remake.members.common.Member;
import felia.lessons.remake.obstacle.common.Obstacle;

public class Road implements Obstacle {

    int length;

    public Road(int length) {
        this.length = length;
    }

    @Override
    public void action(Member member) {
        if(!(member instanceof Running)) {
            System.out.println(member.name + " не умеет бегать!");
        } else {
            if(((Running) member).getMaxRun() > this.length) {
                ((Running) member).run();
            } else {
                System.out.println(member.name + " не смог пробежать!");
            }
        }
    }

}
