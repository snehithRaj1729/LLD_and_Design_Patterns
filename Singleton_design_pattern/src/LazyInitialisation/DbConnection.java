package LazyInitialisation;

public class DbConnection {
    private static DbConnection dbConnection;

    private DbConnection(){}

    public static DbConnection getInstance(){
        if(dbConnection==null){
            return new DbConnection();
        }
        return dbConnection;
    }
}
