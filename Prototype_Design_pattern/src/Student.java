public class Student implements StudentPrototype{
    public int age;
    private int rollNumber;
    public String name;

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public StudentPrototype clone() {
        return new Student(this.age,this.rollNumber,this.name);
    }
}
