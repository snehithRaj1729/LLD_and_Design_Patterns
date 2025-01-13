package Dependency_Inversion_Principle.With_DIP;

public class Main {
    public static void main(String args[]){
        VersionControl git = new Git();
        Developer developer = new Developer(git);
        developer.saveWork();

        //Switching to SVN without modifying Developer class
        VersionControl svn = new SVN();
        Developer anotherDeveloper = new Developer(svn);
        anotherDeveloper.saveWork();
    }
}
