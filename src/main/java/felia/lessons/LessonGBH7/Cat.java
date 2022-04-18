package felia.lessons.LessonGBH7;

public class Cat {
    private final String name;
    private final int appetite;
    public boolean fullness;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean getFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }
}
