package Dependency_Inversion_Principle.With_DIP;

public interface VersionControl {
    void commitChanges(String message);
    void pushChanges();
}
