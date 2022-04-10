package felia.lessons.LessonGBH5;

public class Employees {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employees(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
    }

    public int getAge(){
        return age;
    }

    public void printInfoOfMembers(){
        System.out.println("\n"+"ФИО : " + fio + " " + "Должность : " + position+ " " + "Почта : " + email+ " " + "Номер : " + phone+ " " + "Зарплата : " + salary+ " " + "Возраст : " + age+ " " );
    }
}

