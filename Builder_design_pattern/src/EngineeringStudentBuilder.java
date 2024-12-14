import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("OS");
        subjects.add("CN");
        this.subjects=subjects;
        return this;
    }
}
