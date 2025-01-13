package Dependency_Inversion_Principle.With_DIP;

public class SVN implements VersionControl{
    @Override
    public void commitChanges(String message) {
        System.out.println("SVN commit with message: "+message);
    }

    @Override
    public void pushChanges() {
        System.out.println("SVN changes pushed.");
    }
}
