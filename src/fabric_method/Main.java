package fabric_method;

import fabric_method.factories.BNTU_Student_Fabric;
import fabric_method.factories.BSUIR_Student_Factory;
import fabric_method.factories.UniversityFactory;
import fabric_method.model.University;

public class Main {
    public static void main(String[] args) {
        UniversityFactory factory = new BNTU_Student_Fabric();
        University university = factory.createStudent();

        System.out.println(university.introduction);
        System.out.println(university.specialities);
        System.out.println(university.course);
    }
}
