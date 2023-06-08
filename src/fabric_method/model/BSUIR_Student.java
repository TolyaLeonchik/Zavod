package fabric_method.model;

public class BSUIR_Student extends University{
    public BSUIR_Student() {
        introduction = "Hello! You will be studying in BSUIR.";

        specialities.add("Радиотехника");
        specialities.add("Электронные системы безопасности");
        specialities.add("Вычислительные машины, системы и сети");
        specialities.add("Защита информации в телекоммуникациях");

        course.add("Basic course lectures");
        course.add("Advanced course lectures");
        course.add("Professional course lectures");
    }
}
