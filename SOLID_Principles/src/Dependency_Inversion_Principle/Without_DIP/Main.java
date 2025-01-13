package Dependency_Inversion_Principle.Without_DIP;

public class Main {
    public static void main(String args[]){
        Developer developer  = new Developer();
        developer.saveWork();
        //If teams decides to change to another version control system the developer class must be modified.
    }
}
