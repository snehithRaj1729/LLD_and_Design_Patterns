package Dependency_Inversion_Principle.Without_DIP;

public class Git {
    public void commitChanges(String message){
        System.out.println("Changes committed with message: "+message);
    }

    public void pushChanges(){
        System.out.println("Changes pushed to remote repo.");
    }
}
