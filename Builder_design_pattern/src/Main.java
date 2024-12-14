//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineeringStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}