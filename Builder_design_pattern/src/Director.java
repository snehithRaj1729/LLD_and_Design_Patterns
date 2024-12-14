public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(1).setName("abc").setFatherName("def").setMotherName("ghi").setAge(16).setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(2).setName("abc").setFatherName("def").setMotherName("ghi").setAge(17).setSubjects().build();
    }
}
