package abstract_fabric;

import abstract_fabric.fabric.BNTU_Factory;
import abstract_fabric.fabric.BSUIR_Factory;
import abstract_fabric.fabric.UniversityFactory;
import abstract_fabric.model.Course;
import abstract_fabric.model.Speciality;
import abstract_fabric.model.Student;

public class Main {
    public static void main(String[] args) {
        UniversityFactory factory = new BNTU_Factory();

        Student student = factory.createStudent();
        Speciality speciality = factory.createSpeciality();
        Course course = factory.createCourse();

        System.out.println(student.introduction);
        System.out.println(speciality.specialities);
        System.out.println(course.lectures);
    }
}
