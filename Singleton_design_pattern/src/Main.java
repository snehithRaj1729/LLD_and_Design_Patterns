import EagerInitialisation.DbConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DbConnection eager = DbConnection.getInstance(); //This is from eager initialisation
        DbConnection lazy = DbConnection.getInstance(); //This is from eager initialisation

    }
}