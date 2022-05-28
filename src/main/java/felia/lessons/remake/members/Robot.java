package felia.lessons.remake.members;

import felia.lessons.remake.members.actions.Running;
import felia.lessons.remake.members.common.Member;

public class Robot extends Member implements Running {

    int maxRun;

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    public Robot(String name, int run) {
        this.name = name;
        this.maxRun = run;
    }

    @Override
    public void run() {
        System.out.println("робот по имени " + this.name + ": пробежал");
    }

}
