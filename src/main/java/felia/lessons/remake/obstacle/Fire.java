package felia.lessons.remake.obstacle;

import felia.lessons.remake.members.actions.Jumping;
import felia.lessons.remake.members.common.Member;
import felia.lessons.remake.obstacle.common.Obstacle;

public class Fire implements Obstacle {

    int height;

    public Fire(int height) {
        this.height = height;
    }

    @Override
    public void action(Member member) {
        if(!(member instanceof Jumping)) {
            System.out.println(member.name + " не умеет прыгать через огонь!");
        } else {
            if(((Jumping) member).getMaxJump() > this.height) {
                ((Jumping) member).jump();
            } else {
                System.out.println(member.name + " не смог перепрыгнуть через огонь!");
            }
        }
    }
}
