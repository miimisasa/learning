package felia.lessons.LessonGBH5;

public class Main {
    public static void main(String[] args) {
        Employees[] member = new Employees[5];
        member[0] = new Employees("Михайлов Михаил Михайлович", "Engineer", "mihail@gmail.com", 77777777, 3200, 40);
        member[1] = new Employees("Николаев Николай Николаевич", "SMM-Manager", "nikolay@gmail.com", 88888888, 5200, 27);
        member[2] = new Employees("Иванов Иван Иванович", "HR-Manager", "ivan@gmail.com", 99999999, 4000, 54);
        member[3] = new Employees("Ротарь Ростислав Радионович", "Boss", "rat@gmail.com", 11111111, 6000, 36);
        member[4] = new Employees("Дурова Дарина Димитриевна", "Cleaner", "darina88@gmail.com", 33333333, 2200, 44);

        for (int i = 0; i < member.length; i++) {
            if (member[i].getAge() > 40) {
                member[i].printInfoOfMembers();
            }
        }
    }
}