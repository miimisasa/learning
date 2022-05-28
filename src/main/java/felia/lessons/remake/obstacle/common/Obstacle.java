package felia.lessons.remake.obstacle.common;

import felia.lessons.remake.members.Cat;
import felia.lessons.remake.members.Dog;
import felia.lessons.remake.members.Robot;
import felia.lessons.remake.members.common.Member;

public interface Obstacle {
    abstract void action(Member member);
}
