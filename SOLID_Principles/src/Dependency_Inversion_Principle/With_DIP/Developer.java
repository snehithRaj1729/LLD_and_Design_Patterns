package Dependency_Inversion_Principle.With_DIP;

public class Developer {
    private VersionControl versionControl;

    public Developer(VersionControl versionControl) {
        this.versionControl = versionControl;
    }

    public void saveWork(){
        versionControl.commitChanges("Implemented a new feature.");
        versionControl.pushChanges();
    }
}
