package fabric_method.model;

public class BNTU_Student extends University{
    public BNTU_Student() {
        introduction = "Hello! You will be studying in BNTU";

        specialities.add("Силовые установки");
        specialities.add("Автоматизация технологических процессов");
        specialities.add("Программная инженерия");
        specialities.add("Электроэнергетика и электротехника");

        course.add("Basic course lectures");
        course.add("Advanced course lectures");
        course.add("Professional course lectures");
    }
}
