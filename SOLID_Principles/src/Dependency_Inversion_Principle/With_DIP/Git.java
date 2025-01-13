package Dependency_Inversion_Principle.With_DIP;

public class Git implements VersionControl{
    @Override
    public void commitChanges(String message) {
        System.out.println("Changes committed with message: "+message);
    }

    @Override
    public void pushChanges() {
        System.out.println("Changes pushed to remote repo.");
    }
}
