package fabric_method.factories;

import fabric_method.model.BNTU_Student;
import fabric_method.model.University;

public class BNTU_Student_Fabric extends UniversityFactory{
    @Override
    public University createStudent() {
        return new BNTU_Student();
    }
}
