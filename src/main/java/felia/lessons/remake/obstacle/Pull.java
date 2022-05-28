package felia.lessons.remake.obstacle;

import felia.lessons.remake.members.actions.Jumping;
import felia.lessons.remake.members.actions.Swimming;
import felia.lessons.remake.members.common.Member;
import felia.lessons.remake.obstacle.common.Obstacle;

public class Pull implements Obstacle {

    int length;

    public Pull(int length) {
        this.length = length;
    }

    @Override
    public void action(Member member) {
        if(!(member instanceof Swimming)) {
            System.out.println(member.name + " не умеет плавать!");
        } else {
            if(((Swimming) member).getMaxSwim() > this.length) {
                ((Swimming) member).swim();
            } else {
                System.out.println(member.name + " не смог переплыть!");
            }
        }
    }

}
