package EagerInitialisation;

public class DbConnection {
    private static DbConnection dbConnection = new DbConnection();

    private DbConnection(){}

    public static DbConnection getInstance(){
        return dbConnection;
    }
}
