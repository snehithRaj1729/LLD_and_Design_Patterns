import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Finance");
        subjects.add("Micro eco");
        subjects.add("Macro eco");
        this.subjects=subjects;
        return this;
    }
}
