import java.util.List;

abstract public class StudentBuilder {
    int rollNumber;
    String name;
    int age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age=age;
        return this;
    }

    abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
