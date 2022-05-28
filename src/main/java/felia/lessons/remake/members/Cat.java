package felia.lessons.remake.members;

import felia.lessons.remake.members.actions.Running;
import felia.lessons.remake.members.actions.Swimming;
import felia.lessons.remake.members.common.Member;

public class Cat extends Member implements Running, Swimming {
    int maxRun;
    int maxSwim;

    public Cat(String name, int run, int swim) {
       this.name = name;
       this.maxRun = run;
       this.maxSwim = swim;
    }

    @Override
    public int getMaxRun() {
        return this.maxRun;
    }

    @Override
    public int getMaxSwim() {
        return this.maxSwim;
    }

    @Override
    public void run() {
        System.out.println("кошка по имени " + this.name + ": пробежала");
    }

    @Override
    public void swim() {
        System.out.println("кошка по имени " + this.name + ": проплыла");
    }
}
