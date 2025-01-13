package Dependency_Inversion_Principle.Without_DIP;

public class Developer {
    private Git git; // Direct dependency on Git

    public Developer() {
        this.git = new Git(); //Tight coupling
    }

    public void saveWork(){
        git.commitChanges("Implemented a new feature.");
        git.pushChanges();
    }
}
