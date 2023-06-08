package abstract_fabric.fabric;

import abstract_fabric.model.Course;
import abstract_fabric.model.Speciality;
import abstract_fabric.model.Student;

public abstract class UniversityFactory {
    public abstract Student createStudent();
    public abstract Speciality createSpeciality();
    public abstract Course createCourse();
}
