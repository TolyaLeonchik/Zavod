package abstract_fabric.fabric;

import abstract_fabric.model.BNTU.BNTU_Course;
import abstract_fabric.model.BNTU.BNTU_Specialities;
import abstract_fabric.model.BNTU.BNTU_Student;
import abstract_fabric.model.Course;
import abstract_fabric.model.Speciality;
import abstract_fabric.model.Student;

public class BNTU_Factory extends UniversityFactory{
    @Override
    public Student createStudent() {
        return new BNTU_Student();
    }

    @Override
    public Speciality createSpeciality() {
        return new BNTU_Specialities();
    }

    @Override
    public Course createCourse() {
        return new BNTU_Course();
    }
}
