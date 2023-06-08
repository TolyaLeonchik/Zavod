package abstract_fabric.fabric;

import abstract_fabric.model.BSUIR.BSUIR_Course;
import abstract_fabric.model.BSUIR.BSUIR_Specialities;
import abstract_fabric.model.BSUIR.BSUIR_Student;
import abstract_fabric.model.Course;
import abstract_fabric.model.Speciality;
import abstract_fabric.model.Student;

public class BSUIR_Factory extends UniversityFactory{
    @Override
    public Student createStudent() {
        return new BSUIR_Student();
    }

    @Override
    public Speciality createSpeciality() {
        return new BSUIR_Specialities();
    }

    @Override
    public Course createCourse() {
        return new BSUIR_Course();
    }
}
