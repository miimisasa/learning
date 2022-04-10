package felia.lessons.LessonGBH5;

public class MainD {
    public static void main(String[] args) {
        Test object = new Test(20, 14);
        Test rat = new Test(15, "Dobbie");
    }
}

class Test {
    private int weight;
    private int age;
    private String name;

    public Test(int weight, int age){
        this.weight = weight;
        this.age = age;
    }

    public Test(int age, String name){
        this.age = age;
        this.name = name;
    }
}