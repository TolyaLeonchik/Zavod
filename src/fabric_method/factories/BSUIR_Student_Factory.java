package fabric_method.factories;

import fabric_method.model.BSUIR_Student;
import fabric_method.model.University;

public class BSUIR_Student_Factory extends UniversityFactory{
    @Override
    public University createStudent() {
        return new BSUIR_Student();
    }
}
