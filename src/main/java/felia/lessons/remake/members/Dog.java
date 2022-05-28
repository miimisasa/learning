package felia.lessons.remake.members;

import felia.lessons.remake.members.actions.Jumping;
import felia.lessons.remake.members.actions.Swimming;
import felia.lessons.remake.members.common.Member;

public class Dog extends Member implements Jumping, Swimming {

    int maxJump;
    int maxSwim;

    public Dog(String name, int jump, int swim) {
       this.name = name;
       this.maxJump = jump;
       this.maxSwim = swim;
    }

    @Override
    public int getMaxSwim() {
        return this.maxSwim;
    }

    @Override
    public int getMaxJump() {
        return this.maxJump;
    }

    @Override
    public void swim() {
        System.out.println("собакен по имени " + this.name + ": проплыл");
    }

    @Override
    public void jump() {
        System.out.println("собакен по имени " + this.name + ": прыгнул");
    }


}
